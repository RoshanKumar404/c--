public class DelMaxPreSuf {
    public static void main(String[] args) {
        String s = "ca";
        // s.trim();
        // System.out.println(s);
        // MinLength(s);
        System.out.println(MinLength(s));
    }

    static int MinLength(String s) {
//
//***************** this method took a lot time to commplete**********
    //    // int Output = 0;
    //     StringBuilder Newformed = new StringBuilder(s.trim());
    //     int i = 0;
    //     int j = Newformed.length() - 1;
    //     // for (int i = 0; i < Newformed.length; i++) {
    //     while (i < j && Newformed.charAt(i) == Newformed.charAt(j)) {
            
    //         char ch = Newformed.charAt(i);
    //         while (i <= j && Newformed.charAt(i) == ch) {
    //             Newformed.deleteCharAt(i);
    //             j--;
    //         }
    //         while (i<=j && Newformed.charAt(j)==ch) {
    //             Newformed.deleteCharAt(j);
    //             j--;
                
    //         }
            
    //         j=Newformed.length()-1;
    //          return Newformed.length();

    //     }

    //     System.out.println(Newformed);

    // *** a better and fine version of this will be 
    // we wont use string builder and delete any , we 
    //will just count the character which are not matching suffix and prefix
      s=s.trim();
       int i=0;
    int j= s.length()-1;
    while (i<j &&s.charAt(i)==s.charAt(j)) {
        char ch=s.charAt(i);
        while (i<=j && s.charAt(i)==ch) {
            i++;
        }
         while (i<=j && s.charAt(j)==ch) {
            j--;
        }
        
    }
    return j-i+1;
       
    }


}
