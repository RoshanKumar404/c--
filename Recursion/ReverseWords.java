public class ReverseWords {
public static void main(String[] args) {
    String Sentense="  hello world";
System.out.println(reverse(Sentense));
}
static String reverse(String Sentense){
    String [] Sent=Sentense.trim().split("\\s+");
    //StringBuilder reversed=new StringBuilder();
    int i=0;
    int j= Sent.length-1;
    while (i<j) {
        String temp=Sent[i];
        Sent[i]=Sent[j];
        Sent[j]=temp;
        i++;
        j--;
        
    }
    return String.join(" ",Sent );
}

}
