public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 6, 2, 0, 8 };
        System.out.println(SearchMax(arr, 0, 0));
    }

    static int SearchMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i < end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[]arr,int start,int end){
        
    }
}
