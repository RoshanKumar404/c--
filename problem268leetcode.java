public class problem268leetcode {
    public static void main(String[] args) {
    int []nums={4,1,2,0};

    int r= nums.length;
    int Actualsu=r*(r+1)/2;
    int numSum=0;

    for (int i = 0; i < nums.length; i++) {

        numSum+=nums[i];
    }
    int missing=Actualsu-numSum;
    System.out.println(missing);
    }
    
    
    
    
}

