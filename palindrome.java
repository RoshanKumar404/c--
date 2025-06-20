public class palindrome {
    public boolean ispalindrome(int x){
         int n= x;
    int reversedNumber= 0;
    
    if(n<0){
        return false;
    }
    while(n>0){
        int remainder= n%10;
        reversedNumber= reversedNumber*10 + remainder;
        n/=10;
    }
    return reversedNumber== x;
    }
   
}
