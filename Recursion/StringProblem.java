public class StringProblem {

    public static void main(String[] args) {
        // System.out.println(cahnger("", "afavsa"));
        changer("avasfvea", "");
        // System.out.println(d);
        System.out.println("next type");
        System.out.println(StringWithReturnType("afdasgvsa"));
    }

    static void changer(String before, String after) {
        if (before.isEmpty()) {
            System.out.println(after);
            return;
        }
        char ch = before.charAt(0);
        if (ch == 'a') {
            changer(before.substring(1), after);

        } else {

            changer(before.substring(1), after + ch);
        }
    }

    static String StringWithReturnType(String before) {
        if (before.isEmpty()) {
            // System.out.println(after);
            return "";
        }
        char ch = before.charAt(0);
        if (ch == 'a') {
            return StringWithReturnType(before.substring(1));

        } else {

            return ch + StringWithReturnType(before.substring(1));
        }
    }

}