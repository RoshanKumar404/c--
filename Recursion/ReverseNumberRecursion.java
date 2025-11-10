public class ReverseNumberRecursion {
    public static void main(String[] args) {
        System.out.println(reverse(12345));
    }
    static int  reverse(int n){
        int digits=(int)(Math.log10(n))+1;
        return reverser(n,digits);
    }
    private static int reverser(int n, int digits){
        if(n/10==n){
            return n;

        }
        int remainder=n%10;
        return remainder*(int)(Math.pow(10, digits-1))+reverser(n/10,digits-1);
    }
}
