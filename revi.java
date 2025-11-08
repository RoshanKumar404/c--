import java.util.ArrayList;
import java.util.Arrays;

public class revi {

    public static void main(String[] args) {
        // static method

        // int arr[]={10,30,20,29,28};
        // System.out.println("Array before deletion");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        // int indexToremove=3;
        // int newarr[]=new int[arr.length-1];
        // for (int i = 0,j=0; i < arr.length; i++) {
        //     if(i!=indexToremove){
        //         newarr[j++]=arr[i];
        //     }
        // }
        // System.out.println("array after deletion");
        // for (int i = 0; i < newarr.length; i++) {
        //     System.out.print(newarr[i]+ " ");
        // }


    //dynamic method
    ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(10,2,4,5,6));
    System.out.println("Array before deletion");
    for (int i = 0; i < arr.size(); i++) {
        System.out.print(arr.get(i)+" ");

    }
    System.out.println();
    arr.remove(2);
    System.out.println("after deletion");
    for (int i = 0; i < arr.size(); i++) {
        System.out.print(arr.get(i)+ " ");
    }
    }
    
}
