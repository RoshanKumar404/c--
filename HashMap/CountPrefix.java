import java.util.HashMap;
import java.util.Map;

public class CountPrefix {
    public static void main(String[] args) {
        String[] words = { "a", "b", "c", "ab", "bc", "abc" };
        String s = "abc";
        System.out.println(countPrefix(words, s));
    }

    public static int countPrefix(String[] words, String s) {

        int count = 0;
       Map<String, Integer> PreWords = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            PreWords.put(words[i], i);
        }
        for (String prefix : PreWords.keySet()) {
            if (s.startsWith(prefix)) {
                count++;
            }
        }

        // return count;
        // for (int i = 0; i < words.length; i++) {
        // String prefix=words[i];
        // if (s.startsWith(prefix)) {
        // count++;
        // }

        // }

        return count;

    }

}
