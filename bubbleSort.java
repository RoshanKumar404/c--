import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
     int []arr={4,2,7,0,6,5};
     sort(arr);
    System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        // we have to run the outer loop or steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            // now we have to run the loop till lenght-i and compare the adjascent number
            // and hence the max number will come to last postion
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                }

            }
        }
    }
}
