
public class problem2124 {

    public static void main(String[] args) {
        String s= "abab";
        System.out.println(repeater(s));
    }
    static boolean repeater(String s){
        boolean started= false;
        for(char c:s.toCharArray()){
           if(c=='b')
            {
                started=true;
            }else if (c=='a'&& started) 
            {
                return false;
                
            }
        }
        return true;
    }
}