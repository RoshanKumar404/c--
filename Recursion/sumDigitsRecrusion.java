public class sumDigitsRecrusion {
    public static void main(String[] args) {
        int ans= sum(-1023);
        System.out.println(ans);
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        if(n<0){
            n=-(n);
        }
        int remainder=n%10;
        n=n/10;
        return remainder+sum(n);
    }

    
}