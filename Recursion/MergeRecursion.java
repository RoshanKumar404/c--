import java.util.Arrays;

public class MergeRecursion {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int[] ans = mergesort(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] mergesort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] LeftPart = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] RightPart = mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        return merger(LeftPart, RightPart);
    }

    static int[] merger(int[] FirstArray, int[] secondArray) {
        int[] mergedArray = new int[FirstArray.length + secondArray.length];
        int i = 0, j = 0, k = 0;

        // merging two sorted arrays
        while (i < FirstArray.length && j < secondArray.length) {
            if (FirstArray[i] < secondArray[j]) {
                mergedArray[k++] = FirstArray[i++];
            } else {
                mergedArray[k++] = secondArray[j++];
            }
        }

        // leftover elements
        while (i < FirstArray.length) {
            mergedArray[k++] = FirstArray[i++];
        }

        while (j < secondArray.length) {
            mergedArray[k++] = secondArray[j++];
        }

        return mergedArray;
    }


    // from here we will use the different approach , 
    //in this approach we will use just the indices and divide the arrray on the basis 
    // of indices and sort accordingly
    
}
