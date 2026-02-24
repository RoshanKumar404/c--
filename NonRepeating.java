public class NonRepeating {

    public static void main(String[] args) {
System.out.println(NonRepeatingc("fdwessf"));
    }

    static String NonRepeatingc(String s) {
        int[] freq = new int[256];
        for (char c : s.toCharArray()) {
            freq[c]++;
        }
        for (char c : s.toCharArray()) {
            if (freq[c] == 1) {
                return Character.toString(c);
            }

        }
        return "No";
    }

}
