// public class Main{
//      static int LinearSeearch(int[] arr, int target){
//             if(arr.length==0){
//                 return -1;
//             }

//             for(int i=0;i<arr.length;i++){
//                 int element= arr[i];
//                 if (element== target){
//                     return i;
//                 }
//             }
//             return -143;

//         }
//     public static void main(String[] args) {
//        int[]nums={2,5,3,32,6,};
//        int target=5;
//        int result=LinearSeearch(nums, target);
//        if (result== -143) {
//         System.out.println("not found");
//        }else{
//         System.out.println("element Fond bro "  +  result);
//        }
//     }
// }

public class SearchStrings{
    public static void main(String[] args) {
        String name = "Rohan";
        char target='o';
        System.out.println( "Char founde bro  "+search(name, target));
    }
    static boolean search(String str ,char target){
        if (str.length()==0) {
            return false;
        }
        
        // for (int i = 0; i < str.length(); i++) {
        //     char chr=str.charAt(i);
        //     if (target==chr) {
        //        return true;
        //    // System.out.println("char founded " + chr);
        // }     
        //}
        for(char ch:str.toCharArray)
         return false;
             
        }
    }
