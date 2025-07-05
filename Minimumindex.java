public class Minimumindex {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 3, 1 };
        int target = 3;

        int peak = findPeak(arr);
        int ans = ascendingBinarySearch(arr, target, 0, peak);

        if (ans == -1) {
            ans = descendingBinarySearch(arr, target, peak + 1, arr.length - 1);
        }

        System.out.println(ans);
    }

    static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // Peak is on the left including mid
                end = mid;
            } else {
                // Peak is on the right
                start = mid + 1;
            }
        }
        return start;
    }

    static int ascendingBinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int descendingBinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                start = mid + 1; // flip the comparison
            } else if (target > arr[mid]) {
                end = mid - 1;   // flip the comparison
            } else {
                return mid;
            }
        }
        return -1;
    }
}
