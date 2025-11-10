public class ReverseNumberRecursion {
    public static void main(String[] args) {
       // int num=1232;
        System.out.println(revers(121));
       // System.out.println(reverse(12345));
    }
    static boolean  revers(int n){
        int digits=(int)(Math.log10(n))+1;
        int ans= reverser(n,digits);
        // if(n==ans){return true;
        // }
        return n==ans;
      
    }
    private static int reverser(int n, int digits){
        if(n<10){
            return n;

        }
        int remainder=n%10;
        return remainder*(int)(Math.pow(10, digits-1))+reverser(n/10,digits-1);
        // if (n==n){
        //     return true;
        // } 
    }
}
