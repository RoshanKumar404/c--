public class ReveseString {
    public static void main(String[] args) {
        char[]s={'h','e','y'};
        ReverseString(s);
        System.out.println(java.util.Arrays.toString(s));
    }
    public static void ReverseString(char[]s){
    int start=0;
    int end=s.length-1;
    while (start<end) {
        char  temp= s[start];
        s[start]=s[end];
        s[end]=temp;
        start++;
        end--;
        
    }
    }
    
}
