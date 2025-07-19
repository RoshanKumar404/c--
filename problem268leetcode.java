public class problem268leetcode {
    public static void main(String[] args) {
    int []nums={3,3,3,3,3};

    int r= nums.length-1;
    int Actualsu=r*(r+1)/2;
    int numSum=0;

    for (int i = 0; i < nums.length; i++) {

        numSum+=nums[i];
    }
    int missing=-Actualsu+numSum;
    System.out.println(missing);
    }
    
    //287
    
    
}

