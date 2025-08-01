public class LcmHcf {
    public static void main(String[] args) {
       //int arr={4,8};
        int a = 4;
        int b=8;
       System.out.println(HCF(a, b)*LCM(a,b));

    }
    //fist we will find HCF of two digits
    static int HCF(int a, int b){
        while (b!=0) {
            int temp=b;
            b=a%b;
            a=temp;
            
        }
        return a;
    }
    //LCM for two numbers
    static int  LCM(int a, int b){
return a*b/HCF(a, b);
    }




}
