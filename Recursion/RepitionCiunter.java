public class RepitionCiunter {
    public static void main(String[] args) {
System.out.println(counter(2004034040));
    }

    static int counter(int n) {
return  Repitation(n,0);
    }
    static int Repitation(int n,int c){
        if (n==0) {
            return c;

        }
        int remainder= n%10;
        if (remainder==0) {
           return Repitation(n/10, c+1);
        }
        return Repitation(n/10,c);
    }
}
