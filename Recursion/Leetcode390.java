public class Leetcode390 {

    public static void main(String[] args) {
    System.out.println(notEliminated(9));
    }
    static int notEliminated(int n){
        // boolean left= true;
        // int start=1;
        // int step=1;
        // int remain=n;
        // while (remain>1) {
        //     if (left||remain%2==1) {
        //         start+=step;
        //     }
        //     step*=2;
        //     remain/=2;
        //     left=!left;
        // }
        // return start;
         //When we perform the first pass (from the left), we remove all odd numbers. We are left with {2,4,6,…}. If we divide these by 2, we get {1,2,3,…,n/2}.
        //
        //The trick is that the next move on this new sequence is from the right.
        //
        //So the relationship is:
        //f(n)=2×g(n/2)
        //
        //Since we know g(k)=k+1−f(k), we can substitute that back into the equation:
        //f(n)=2×(n/2+1−f(n/2))

        if (n==1)return 1;

        return 2*(n/2+1-remainings(n/2));
    }
}