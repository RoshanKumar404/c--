import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateSubset {
    public static void main(String[] args) {
        int[]arr={212,2,212};
        List<List<Integer>>ans=Duplicates(arr);
        for(List<Integer>list:ans){
System.out.println(list);
        }
    }
    static List<List<Integer>> Duplicates(int[]arr){
        Arrays.sort(arr);
        List<List<Integer>> Outer=new ArrayList<>();
        Outer.add(new ArrayList<>());
        int start= 0,end=0;
        for(int i =0;i<arr.length;i++){
            start=0;
            if (i>0&&arr[i]==arr[i-1]) {
                start=end+1;
            }
            end=Outer.size()-1;
            for(int j=start; j<=end;j++){
                List<Integer>Internal= new ArrayList<>(Outer.get(j));
                Internal.add(arr[i]);
                Outer.add(Internal);
            }
        }

         return Outer;
    }
}
