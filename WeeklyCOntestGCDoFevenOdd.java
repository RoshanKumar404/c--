public class WeeklyCOntestGCDoFevenOdd {
public static void main(String[] args) {
    int n=4;
System.out.println(HCF(Even(n), Odd(n)));
}
static int Even(int n){
    //    int EvenSum=0;
    //    for (int i=1;i<=n;i++){
    //        if(i%2==0){
    //            EvenSum+=i;
    //        }
    //    }
    //    return EvenSum;
        return n*(n+1);
    }
    static int Odd(int n){
    //    int OddSum=0;
    //    for (int i=1;i<=n;i++){
    //        if(i%2!=0){
    //            OddSum+=i;
    //        }
    //    }
    //    return OddSum;
        return n*n;
    }

    public static int HCF(int a,int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;

        }
        return a;
    }
    
}