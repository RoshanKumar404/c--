public class reverseingarray {
    public static void main(String[] args) {
        
    
    int []nums={4,5,3,2,7,1,9};
    int k=4;
    rotate(nums,k);
    for(int num:nums){
        System.out.println(num+" ");
    }

    }

    public static void rotate(int[] nums,int k){
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    private static void reverse(int[]nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

}

