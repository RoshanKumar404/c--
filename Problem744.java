public class Problem744 {
    //its will be solved tommorow
   // here is the solution

   class Solution {
    public static void main(String[] args) {
          char[]letters={'a','v','w','x','y','z'};
          char target='a';
         // System.out.println(nextGreatestLetter(letters,target));
    }
  
    public char nextGreatestLetter(char[] letters, char target) {
         int start = 0;
        int end = letters.length - 1;
        // if (target>arr[arr.length-1]||target<arr[start]) {
        //     return -1;
        // }
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (target<letters[mid]) {
              
                 end=mid-1;
            }else {
              start=mid+1;
                 }

            // }else if(target==arr[mid]){
            //     return arr[mid];
            // }else{
            //     return  arr[mid];
            //   //  System.out.println(arr[mid]);
            // }
            // System.out.println("the ceilg number is: "+arr[mid+1]);
        }
        return letters[start% letters.length] ; // and for floor retur end or start -1;
       
        // if (condition) {
            
        // }

    }
    }

}
