public class Leetcode779 {
    public static void main(String[] args) {
        System.out.println(solve(4, 6));
    }
    static int  solve(int n, int k){
        if (n==1) {
            return 0;
        }
        int length= (int)Math.pow(2, n-1);
        int mid= length/2;
        if (k<=mid) {
            return solve(n-1, k);
        }else{
            // here im complementting the result to get the desired reult as 
            // the second half is the complemtn of 1st half
            return 1-solve(n-1, k-mid);
        }
    }
    
}
