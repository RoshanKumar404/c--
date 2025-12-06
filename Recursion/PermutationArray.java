import java.util.ArrayList;

public class PermutationArray {
    public static void main(String[] args) {
        ArrayList<String> ans = PermutationArr("", "abc");
        System.out.println(ans);
    }

    static ArrayList<String> PermutationArr(String pr, String Up) {
        if (Up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(pr);
            return list;
        }
        char ch = Up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= pr.length(); i++) {
            String First = pr.substring(0, i);
            String Sec = pr.substring(i, pr.length());
            ans.addAll(PermutationArr(First + ch + Sec, Up.substring(1)));

        }
        return ans;
    }

}
