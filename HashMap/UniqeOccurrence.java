import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqeOccurrence {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 1, 1, 3 };
        System.out.println(Occurrence(arr));
    }

    public static boolean Occurrence(int[] arr) {
        Map<Integer, Integer> mo = new HashMap<>();
        for (int x : arr) {
            mo.put(x, mo.getOrDefault(x, 0) + 1);
        }

        Set<Integer> st = new HashSet<>();
        for (int freq : mo.values()) {
            if (st.contains(freq)) {
                return false;
            }
            st.add(freq);
        }

        return true;
    }
}
