public class RecursionNto1 {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        //System.out.println(n);
        //learned the concept of precedding n and exceeding n by adding -- before and after the n
         fun (--n);
     //this is woring logic:-   System.out.println(fun(n-1)*n);
       
       System.out.println(n);
    }
    
}
