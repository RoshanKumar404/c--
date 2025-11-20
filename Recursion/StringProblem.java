public class StringProblem {

    public static void main(String[] args) {
      //System.out.println(cahnger("", "afavsa"));
   changer("avasfvea","");
    // System.out.println(d);
    }
    static void changer(String before, String after){
        if (before.isEmpty()) {
           System.out.println(after);
            return;
        }
        char ch= before.charAt(0);
        if (ch=='a') {
            changer( before.substring(1),after);

        }else{ 
            
            changer(before.substring(1), after+ch);
        }
    }
    
}