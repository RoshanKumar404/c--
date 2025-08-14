import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class wordPattern {
    public static void main(String[] args) {
          String pattern="abba";
    String s="dog cat cat dog";
    // System.out.println(pattern.toCharArray());
    // System.out.println(Arrays.toString(s.toCharArray()));
    System.out.println(wordpattern(s, pattern));
    }
    public static  boolean wordpattern(String s, String pattern){
        String [] words=s.split(" ");
       // char [] ch= Arrays.toString(pattern);
        if (words.length!=pattern.length()||words.length==0) {
            return false;
        }
        Map<String,Character> wordTOChar=new HashMap<>();
        Map<Character,String> CharToWord=new HashMap<>();
        for (int i = 0; i < words.length; i++) {
         String word= words[i];
         char ch =pattern.charAt(i);

         wordTOChar.putIfAbsent(word,ch);
         CharToWord.putIfAbsent(ch,word);
         if (wordTOChar.get(word)!=ch|| !CharToWord.get(ch).equals(word)) {
            return false;
                 }
        }

        return true;
    }
  
}


