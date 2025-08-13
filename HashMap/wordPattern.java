import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class wordPattern {
    public static void main(String[] args) {
          String pattern="abba";
    String s="dog cat cat dog";
    System.out.println(pattern.toCharArray());
    System.out.println(Arrays.toString(s.toCharArray()));
    }
    public static  boolean wordpattern(String s, String pattern){
        String [] words=s.split(" ");
        char [] characters= Arrays.toString(pattern);
        if (words.length!=characters.length||words.length==0) {
            return false;
        }
        Map<String,Character> patternmatching=new HashMap<>();
        for (int i = 0; i < characters.length; i++) {
           patternmatching.put(words[i], characters[i]);
        }
        
    }
  
    /*
     * 
     *    String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;

        Map<String, Character> wordToChar = new HashMap<>();
        Map<Character, String> charToWord = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char ch = pattern.charAt(i);

            // Put mappings if absent
            wordToChar.putIfAbsent(word, ch);
            charToWord.putIfAbsent(ch, word);

            // Check if existing mappings match
            if (wordToChar.get(word) != ch || !charToWord.get(ch).equals(word)) {
                return false;
            }
        }
        return true;
     */

  
}


