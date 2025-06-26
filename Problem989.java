class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
          List<Integer> ans = new ArrayList<>();
        int StartingPoint= num.length - 1;
        int carry =0;
        while(StartingPoint>=0||k>0){
            int numvalue=0;
            if(StartingPoint>=0){
                numvalue=num[StartingPoint];
            }
             int digit= k%10;
             int sum=numvalue+digit+carry;
             int newdigit= sum%10;
             carry=sum/10;
             ans.add(newdigit);
             StartingPoint--;
             k=k/10;

        }
        if(carry>0){
            ans.add(carry);
        }
        Collections.reverse(ans);
        return ans;
        
        
    }
}