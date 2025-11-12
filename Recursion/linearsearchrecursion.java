public class linearsearchrecursion {
    // public static void main(String[] args) {
    //     int[] arr={5,6,2,7,3,13,4};
    //     int target=13;
    //     System.out.println(Linearrecursion(arr, target, 0));

    // }
    // static int Linearrecursion(int []arr,int target,int u){
    //     if (u==arr.length) {
    //         return -1;
    //     }
    //     if (arr[u]==target) {
    //         return u;
    //     }
       
        
        // return Linearrecursion(arr, target, u+1);
    // }

    //**************** */ now jut check that the element is present or not******************
    public static void main(String[] args) {
        int []arr={23,4,534,2,42,543};
        int target=534;
        System.out.println(linear(arr, target,0));
    }
    static boolean linear(int []arr,int target,int i){
        if (i==arr.length) {
            return false;

        }
        return arr[i]==target || linear(arr, target, i+1);
    }
    // this is for search from the last just have to change the index from 0 to array.length 
        static boolean linearfromlast(int []arr,int target,int i){
        if (i==-1) {
            return false;

        }
        return arr[i]==target || linear(arr, target, i-1);
    }
}
