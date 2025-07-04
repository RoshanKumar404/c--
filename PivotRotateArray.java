public class PivotRotateArray {
    public static void main(String[] args) {
        int[] arr = {1};
        int target = 1;
        // int Pivott=Pivot(arr);
        // System.out.println(Pivott);
        System.out.println(search(arr, target));

    }

    static int Piivot(int[] arr) {
        
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[end]) {
                start = mid + 1;

            } else {
                end = mid;
            }
        }
        return start;
    }

static int search(int[]arr,int target){
    int start;
    int end;
    int Pivot=Piivot(arr);
    if(Pivot==0||target >= arr[0]){
        start=0;
      end=Pivot==0?arr.length-1:Pivot-1;
    }else{
        start=Pivot;
        end=arr.length-1;
    }
    while (start<=end) {
        int mid=start+(end-start)/2;

            if (target>arr[mid]) {
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;

            }else{
                return mid;
            }
        
    }
    return -1;

}
}
