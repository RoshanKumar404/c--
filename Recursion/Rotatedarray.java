public class Rotatedarray {
    public static void main(String[] args) {
        int []arr={5,6,1,2,3,4};
        System.out.println(Rotated(arr, 10, 0,arr.length-1));

    }
    static int Rotated(int[]arr,int target,int start,int end){
        if (start>end) {
            return -1;
        }
        int mid=start+(end-start)/2;
        if (arr[mid]==target) {
            return mid;
        }
        if (arr[start]<=arr[mid]) {
            if (target>=arr[start]&& target<=arr[mid]) {
                end=mid-1;
              return  Rotated(arr, target, start, end);
                
            }else{
                start=mid+1;
                return Rotated(arr, target, start, end);
            }
        }
        if (target>=arr[mid]&&target <=arr[end]) {
            return Rotated(arr, target, mid+1, end);
            
        }else{
            return Rotated(arr, target, start, mid-1);
        }
    }
    
}
