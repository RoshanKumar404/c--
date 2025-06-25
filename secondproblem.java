public class secondproblem {
    public static void main(String[] args) {
        int[][] accounts = { { 2, 4, 2 }, { 2, 7, 4 } };
        System.out.println(maxwealth(accounts));
    }

    public static int maxwealth(int[][] accounts) {
        int ans = 0;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
