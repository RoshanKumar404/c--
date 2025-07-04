public class problem34 {
    // public static void main(String[] args) {
        
    // }
    // // public int[] search(int [] nums,int target){
    //     int start=0;
    //     int end=num.length-1;
    //     while(start<end){
    //         int mid=start+ (end-start)/2;
    //         if (target<nums[mid]){
    //             end=mid-1;
    //         }else if(target>nums[mid]){
    //             start=mid+1;
    //         }else{
    //             return mid;
    //         }
    //     }
    //     return ans;


    // }
    public int  searchRange(int[]nums,int target){
        int []ans={-1,-1};
        int end=searching(nums, target, false);
        int start=searching(nums, target, true);
        ans[0]=start;
        ans[1]=end;
        return ans;
        }
    public int searching(int[]nums,int target,boolean first){
        int start=0;
        int end=num.length-1;
        while(start<end){
            int mid=start+ (end-start)/2;
            if (target<nums[mid]){
                end=mid-1;
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
              ans=mid;
              if (first) {
                end=mid-1;  
              }else{
                start =mid+1;
              }
                // return mid;
            }
        }
        return ans;
    }
}



