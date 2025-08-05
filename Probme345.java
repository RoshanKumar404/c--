public class Probme345 {
    public static void main(String[] args) {
    String S="Jai Roshan";
    System.out.println(SwapVowel(S));
    }
    // static boolean isVowel(char ch){
    //     if (ch=='a'||ch=='U'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='i'||ch=='O') {
    //         return true;
    //     }else{
    //         return false;
    //     }
    // }
    // static int  swap(int a,int b ){
    //     int temp=a;
    //     a=b;
    //     b=temp;

    // }
    static boolean isVowel(char ch){
       return "aeiouAEIOU".indexOf(ch)!=-1;
    }
    static String SwapVowel(String S){
        // String [] smallVowe={'a','e','i','o','u'};
        // String[]CapitalVowel={'A','E','I','O','U'};
        char []arr=S.toCharArray();
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            if (!isVowel(arr[start])) {
                start++;
            }else if(!isVowel(arr[end])){
                end--;
            }else{
              char temp=arr[start];
              arr[start]=arr[end];
              arr[end]=temp;
              start++;
              end--;
            }
            
        }
        return new String(arr);
    }
    
}
