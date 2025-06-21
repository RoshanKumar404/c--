import java.util.Arrays;
public class Median {
     public static void main(String[] args) {
        int[]arr1={1,3};
        int[]arr2={2};
        int sum=0;
        int[] merger=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            merger[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            merger[arr1.length + i]=arr2[i];
        }
        for(int val:merger){
            System.out.println(val + "");
        }
        for(int i=0;i<merger.length;i++){
            sum+=merger[i];
        }
        System.out.println("sum " + sum);
        Arrays.sort(merger);

        double median;
        int len=merger.length;
        if (len%2==0) {
             median = (merger[len / 2 - 1] + merger[len / 2]) / 2.0;

            
        } else {
            median= merger[len / 2];
        }
        // median= sum / merger.length;
        System.out.println("median  " + median + " \n and the merger length = " + merger.length );
//     tem.out.println("Median: " + median);
    }
 }

