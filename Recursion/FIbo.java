public class FIbo {
    public static void main(String[] args) {
        System.out.println(fibonachhi(7));
    }
    static int  fibonachhi(int n){
        if (n<2) {
            return n;
        }
        return fibonachhi(n-1)+fibonachhi(n-2);
    }
    
}
