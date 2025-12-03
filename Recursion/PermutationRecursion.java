import javax.print.DocFlavor.CHAR_ARRAY;

public class PermutationRecursion {
public static void main(String[] args) {
    permutation("abc", "");
    Digit("a1b2", "");
}
static void permutation(String Unprocessed,String processed){
    if (Unprocessed.isEmpty()) {
        System.out.println(processed);
        return;
    }
    char ch= Unprocessed.charAt(0);
    for(int i=0;i<=processed.length();i++){
        String First= processed.substring(0,i);
        String Second= processed.substring(i);
        permutation(Unprocessed.substring(1),First+ch+Second);
    }
}

}