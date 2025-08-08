import java.util.Arrays;

public class numSubseq {
    static final int  M = (int)1e9 + 7;

    public static void main(String[] args) {
        int[] nums = { 3, 3, 6, 8 };
        int target = 10;
        System.out.println(Subs(nums, target));

    }

    static int Subs(int[] nums, int target) {
        Arrays.sort(nums);
        int cout = 0;
        int i = 0;
        int sum = 0;
        int j = nums.length - 1;
        int[] power = new int[nums.length];
        power[0] = 1;
        for (int k = 1; k < power.length; k++) {
            power[k] = (power[k - 1] * 2) % M;
        }
        // for ( i = 0; i < nums.length; i++)
        // we have to compute power before before the loop starts so that it solves in
        // time or before time
        while (i <= j) {
            sum = nums[i] + nums[j];
            if (sum <= target) {
                // here computing the power will take mch time
                // cout+%Modulo= Math.pow(2, j-i)%Modulo;
                // cout=((int)cout%M+(int)Math.pow(2, j-1)%M)%M;
                cout=(cout+power[j-i])%M;
                i++;

            } else {
                j--;

            }
            // i++;

        }
        // i++;
        /// }

        return cout;
    }
}