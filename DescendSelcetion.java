import java.util.Arrays;

public class DescendSelcetion {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 1, 5, 3, 7, 9, 0, 4 };
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int arr[]){
        for (int i = 0; i < arr.length; i++) {
        int last=arr.length-i-1;
        int minIndex=searchmin(arr,0,last);
            swap(arr,last, minIndex);
        }
    }
    static int searchmin(int[]arr, int start,int end){
        int min=start;
        for (int i = start; i <=end; i++) {
           if (arr[min]>arr[i]) {
            min=i;
           }
            
        }
        return min;
    }
    static void swap(int []arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
