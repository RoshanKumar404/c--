public class linearsearchrecursion {
    public static void main(String[] args) {
        int[] arr={5,6,2,7,3,13,4};
        int target=13;
        System.out.println(Linearrecursion(arr, target, 0));

    }
    static int Linearrecursion(int []arr,int target,int u){
        if (u==arr.length) {
            return -1;
        }
        if (arr[u]==target) {
            return u;
        }
       
        
        return Linearrecursion(arr, target, u+1);
    }
}
