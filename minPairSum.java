import java.util.Arrays;

public class minPairSum {
public static void main(String[] args) {
    int  [] nums={3,5,4,2,4,6};
   System.out.println(pairsum(nums));

}
static int pairsum(int[] nums){
    Arrays.sort(nums);
    int sum=0;
    int i=0;
    int j= nums.length-1;
    while (i<j) {
        int Psum= nums[i]+nums[j];
        if (sum<Psum) {
            sum=Psum;
        }
        //ye bhi ek option hai
       // sum=Math.max(ans,nums[i]+nums[j]);
        i++;
        j--;
        
    }

    return sum;
}
    
}
