public class PhonePadLetters {
    public static void main(String[] args) {
        Phone("","345");
    }
    static void Phone(String pr,String up){
        if (up.isEmpty()) {
            System.out.println(pr);
            return;
        }
       int digit=  up.charAt(0)-'0';
       for(int i= (digit-1)*3;i<digit*3;i++){
        char ch=(char) ('a'+i);
        Phone(pr+ch,up.substring(1));
       }
    }
    
}
