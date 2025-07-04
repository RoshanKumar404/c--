import java.util.Random;

class dsa384 {
    private int[] original;
    private int[] array;
    private Random rand;

    public Solution(int[] nums) {
        original = nums.clone();
        array = nums.clone();
        rand = new Random();
    }

    public int[] reset() {
        array = original.clone();
        return array;
    }

    public int[] shuffle() {
        for (int i = 0; i < array.length; i++) {
            int j = i + rand.nextInt(array.length - i); // j in [i, n-1]
            swap(array, i, j);
        }
        return array;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
