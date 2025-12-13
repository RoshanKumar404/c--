import java.util.ArrayList;

public class PhonePadLetters {
    public static void main(String[] args) {
       // Phone("", "345");
        subsets("", "12");
    }

    static void Phone(String pr, String up) {
        if (up.isEmpty()) {
            System.out.println(pr);
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            Phone(pr + ch, up.substring(1));
        }
    }
    static ArrayList<String>subsets(String pr,String up){
        if (up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(pr);
            return list;
        }
        int digit= up.charAt(0)-'0';
        ArrayList<String> list= new ArrayList<>();
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch= (char)('a'+i);
            list.addAll(subsets(pr+ch,up.substring(1)));

        }
        return list;
        // char ch= up.charAt(0)-'0';
        // ArrayList<String>left= subsets(pr+ch, up.substring(1));
        // ArrayList<String>right= subsets(pr, up.substring(1));
        // left.addAll(right);
        // return left;
    }

}
