public class SearchInfinite {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
        int target = 11;
        System.out.println(AnsLoop(arr, target));
    }

    static int AnsLoop(int[] arr, int target) {
        int start = 0;
        int end = 2;
        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;

        }
        return BinarySearch(arr, target, start, end);
    }

    static int  BinarySearch(int[]arr,int target,int start,int end){
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (target<arr[mid]) {
                end=mid-1;
                
            }      else if(target>arr[mid]){
                start=mid+1;

            }      else{
                return mid;
            }
           
        }
         return -1;

    }
}