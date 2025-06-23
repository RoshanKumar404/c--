public class TwoSum {

    public static void main(String[] args) {

        int [] nums={4,3,2,6,7};
        int target=10;
        int[] result=sum(nums,target);
       
         if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No valid pair found.");
        }
       // System.out.println(result);

    }
    static int[]sum(int []nums,int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j]==target) {
                    return new int []{i,j};
                }
            }
        }
        return new int[]{};
    }
}

