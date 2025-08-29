public class AliceAndBob {
    public static long main(String[] args) {
        int n=2;
        int m=3;
        long oddX = (n + 1) / 2;
        long evenX = n / 2;
        long oddY = (m + 1) / 2;
        long evenY = m / 2;

        return oddX * evenY + evenX * oddY;
    }
    
}
