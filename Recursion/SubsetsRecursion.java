import java.util.ArrayList;

public class SubsetsRecursion {
    public static void main(String[] args) {
        subsets("", "abc");
        System.out.println(Subseq("","abcd"));
    }

    static void subsets(String processed, String Unprocessed){
        if (Unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch= Unprocessed.charAt(0);
        
        subsets(processed+ch, Unprocessed.substring(1));
        subsets(processed, Unprocessed.substring(1));
    }
    static ArrayList<String> Subseq(String processed,String Unprocessed){
        if (Unprocessed.isEmpty()) {
            ArrayList<String>list= new ArrayList<>();
            list.add(processed);
            return list;
        
        }
        char ch= Unprocessed.charAt(0 );
        ArrayList<String>Lefttree= Subseq(processed, Unprocessed.substring(1));
        ArrayList<String>RightTree=Subseq(processed+ch,Unprocessed.substring(1));
        Lefttree.addAll(RightTree);
        return Lefttree;
    }
    
}
