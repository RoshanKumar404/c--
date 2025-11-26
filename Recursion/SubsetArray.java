import java.util.ArrayList;
import java.util.List;

public class SubsetArray {
public static void main(String[] args) {
int []arr={1,2,3};
List<List<Integer>> ans= subsets(arr);
for(List<Integer> list:ans){
    System.out.println(list);
}

   // System.out.println();
}
static List<List<Integer>>subsets(int []arr){
    List<List<Integer>> Outer= new ArrayList<>() ;
    Outer.add(new ArrayList<>());
    for(int num: arr){
        int n= Outer.size();
        for(int i=0;i<n; i++){
        List<Integer> Internal= new ArrayList<>(Outer.get(i)) ;
    Internal.add(num);
    Outer.add(Internal);
        }
    }


    return Outer;
} 
    
}