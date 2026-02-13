public class ReveseString {
    public static void main(String[] args) {
        char[]s={'h','e','l','k','y',};
        String ss="abcdefg";
        int k=2;
        String result=ReverseString(ss,k);
        System.out.println(result);
        // System.out.println(java.util.Arrays.toString(s));
    }
    // in this i shifted the core from char to sctrings
    public static String ReverseString(String ss,int k){
    char[]s =ss.toCharArray();
    for (int i = 0; i < s.length; i+=2*k) {
        
    
    int start=i;
    int end=Math.min(i+k-1, ss.length()-1);
    
    while (start<end) {
        
        char  temp= s[start];
        s[start]=s[end];
        s[end]=temp;
        start++;
        end--;
        
    }
}
    return new String(s);
    }
    
}
