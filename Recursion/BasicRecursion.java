public class BasicRecursion {
    
    public static void main(String[] args) {
        Sendmessage();
    }
    static void Sendmessage(){
        System.out.println("Ram Ram bhai sarya ne");
        Sendmessage1();
    }
    static void Sendmessage1(){
        System.out.println("Ram Ram bhai Sarya ne");
        Sendmessage2();
    }
    static void Sendmessage2(){
        System.out.println("Ram Ram bhai Sarya ne");
    }
}
