public class binarySearchProblems {

    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6,7, 11 };
        int target = 0;
        System.out.println(ceilingTarget(arr, target));
        System.out.println();

    }
    // static int ceilingTarget(){

    // }

    static int ceilingTarget(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (target>arr[arr.length-1]||target<arr[start]) {
            return -1;
        }
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (target>arr[mid]) {
                start=mid+1;
            }else if (target<arr[mid]) {
             end=mid-1;    
            // }else if(target==arr[mid]){
            //     return arr[mid];
            }else{
                return  arr[mid];
              //  System.out.println(arr[mid]);
            }
            // System.out.println("the ceilg number is: "+arr[mid+1]);
        }
        return arr[end] ; // and for floor retur end or start -1;
       
        // if (condition) {
            
        // }

    }
}
