public class Solution {
    public int reverse(int x) {
        
        int reversenumber = 0;
        int sign=1;
        if(x<0){
            sign=-1;
            x=-x;
        }
        while (x > 0) {
            int remainder = x % 10;
            if(reversenumber>(Integer.MAX_VALUE-remainder)/10){
                return 0;
            }
            
            reversenumber = reversenumber * 10 + remainder;
            x /= 10;
        }
        return reversenumber*sign;
       
    }
}
 
