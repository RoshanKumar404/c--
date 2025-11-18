import java.util.Arrays;

public class MergeRecursion {
    public static void main(String[] args) {
        int []arr={5,4,3,2,1};
        int ans=mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int [] mergesort(int[]arr){
        if (arr.length==1) {
            return arr;
        }
        int mid=arr.length/2;
        int[] LeftPart= mergesort(Arrays.copyOfRange(arr,0,mid));
        int []RightPart= mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merger(LeftPart,RightPart);
    }
    static int[]merger(int[]FirstArray,int[] secondArray){
        int[] mergedArray=new int[FirstArray.length+secondArray.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<FirstArray.length && secondArray.length>j) {
            if (FirstArray[i]<secondArray[j]) {
                merger[k]=FirstArray[i];
                i++;
                
            }else{
                merger[k]=secondArray[j];
                j++;
            }
            return merger;
            
        }

    }
}
