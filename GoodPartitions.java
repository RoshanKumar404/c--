import java.util.HashMap;
import java.util.Map;

public class GoodPartitions {
   static final int M = (int)1e9 + 7;
    int k = 0;

    public static void main(String[] args) {

        int[] nums = { 1,1,1,3};
        System.out.println(Partitions(nums));

    }

    static int Partitions(int[] nums) {
        Map<Integer, Integer> lastSeenMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            lastSeenMap.put(nums[i], i);
        }
        // int n = nums.length;
       
      //  int j = Math.max(j, lastSeenMap.get(nums[0]));
        int result = 1;
        int maxlast=0;
        for (int i = 0; i < nums.length; i++) {
            maxlast=Math.max(maxlast, lastSeenMap.get(nums[i]));
            if (i==maxlast && i!=nums.length-1) {
                result=(result*2)%M;
                        }
        }
        // while (i < n) {
        //     if (i > j) {
        //         result = (result * 2) % M;
        //     }
        //     j = Math.max(j, lastSeenMap.get(nums[i]));
        //     i++;
        // }
        
       return result;

    }

}
