public class Leetcode390 {

    public static void main(String[] args) {
    System.out.println(notEliminated(9));
    }
    static int notEliminated(int n){
        boolean left= true;
        int start=1;
        int step=1;
        int remain=n;
        while (remain>1) {
            if (left||remain%2==1) {
                start+=step;
            }
            step*=2;
            remain/=2;
            left=!left;
        }
        return start;
    }
}