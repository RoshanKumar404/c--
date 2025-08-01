public class LcmHcf {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5};
        // int a = 4;
        // int b=8;
        // System.out.println(HCF(a, b)*LCM(a,b));
        System.out.println("HCf of the array is : "+HCFarray(arr));
        System.out.println("Lcm of the array is : "+ LCMarray(arr));
        int factorStore=HCFarray(arr)*LCMarray(arr);
        System.out.println(factorStore);

    }

    // fist we will find HCF of two digits
    public static int HCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;

        }
        return a;
    }

    // LCM for two numbers
    public static int LCM(int a, int b) {
        return a * b / HCF(a, b);
    }

    // we will proceed for whole array
    public static int HCFarray(int[] arr) {
        int result = arr[0];
        for (int o = 1; o < arr.length; o++) {
            result = HCF(result, arr[o]);

        }
        return result;
    }
    // we will proceed for LCM of whole array
    public static int  LCMarray(int []arr){
        int result=arr[0];
        for (int i = 1; i < arr.length; i++) {
            result=LCM(result, arr[i]);
            
        }
        return result;
    }

}
