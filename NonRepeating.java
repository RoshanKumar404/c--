public class NonRepeating {

    public static void main(String[] args) {
       
      System.out.println( NonRepeating("aabcdse"));
    }
    static String NonRepeating(String s){
      int[] freq = new int[256];
      for(char c: s.toCharArray()){
        freq[c]++;
      }
      for(char c :s.toCharArray()){
        if (freq[c]==1) {
            return Character.toString(c);
        }
      }

        return "Nove";
    }
    
}
