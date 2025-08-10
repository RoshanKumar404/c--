import java.util.HashMap;
import java.util.Map;

public class goodExist {
    public static void main(String[] args) {
        int []nums={1,1,1,2,1};
        System.out.println(ExistOrNot(nums));

    }
    static boolean ExistOrNot(int [] nums){
        Map<Integer,Integer> lastseenMap=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            lastseenMap.put(nums[i],i);
        }
        int maxlast=0;
        for (int i = 0; i < nums.length; i++) {
            maxlast=Math.max(maxlast, lastseenMap.get(nums[i]));
            if (i==maxlast && i!=nums.length-1) {
                return true;
            }
        }
    return false;
    
    }
}
