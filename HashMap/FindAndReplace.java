import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAndReplace {
    
    public static void main(String[] args) {
        String [] words={"abc","deq","mee","aqq","dkd","ccc"};
        String pattern="abb";

        System.out.println(FindAndReplce(words,pattern));
    }
    public List <String> FindReplce(String []words,String pattern){

        List<String> reult= new ArrayList<>();   
        String patternForm=normalised(pattern);
        for(String word:words){
            if (normalised(pattern).equals(patternForm)) {
                reult.add(word);
                
            }
        }
        return reult;
    
    }
    private String  normalised(String word){
        Map<Character,Integer> map= new HashMap<>();
        StringBuilder sb=new StringBuilder();
        int code=0;
         for(char c : word.toCharArray()){
            map.putIfAbsent(c,code++);
            sb.append(map.get(c));

         }
         return sb.toString();

    }
}
