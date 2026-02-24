public class problem387 {
    public static void main(String[] args) {
        System.out.println(Unique("sdfsas"));
    }
    public static int  Unique(String s){
        int [] count= new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            count[c-'a']++;

        }
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if (count[c-'a']==1) {
                return i;
            }
        }
        return -1;
    }

    
}
