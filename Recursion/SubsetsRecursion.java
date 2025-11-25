public class SubsetsRecursion {
    public static void main(String[] args) {
        subsets("", "abc");
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
    
}
