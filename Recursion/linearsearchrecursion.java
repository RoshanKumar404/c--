import java.util.ArrayList;

public class linearsearchrecursion {
    // public static void main(String[] args) {
    //     int[] arr={5,6,2,7,3,13,4};
    //     int target=13;
    //     System.out.println(Linearrecursion(arr, target, 0));

    // }
    // static int Linearrecursion(int []arr,int target,int u){
    //     if (u==arr.length) {
    //         return -1;
    //     }
    //     if (arr[u]==target) {
    //         return u;
    //     }
       
        
        // return Linearrecursion(arr, target, u+1);
    // }

    //**************** */ now jut check that the element is present or not******************
    public static void main(String[] args) {
        int []arr={23,4,534,2,534,42,2,543};
        int target=534;
        System.out.println(linear(arr, target,0));
        findlist(arr, target, 0);
        System.out.println(list);
        System.out.println(finder2(arr,2,0));
    }
    static boolean linear(int []arr,int target,int i){
        if (i==arr.length) {
            return false;

        }
        return arr[i]==target || linear(arr, target, i+1);
    }
    // this is for search from the last just have to change the index from 0 to array.length 
        static boolean linearfromlast(int []arr,int target,int i){
        if (i==-1) {
            return false;

        }
        return arr[i]==target || linear(arr, target, i-1);
    }

    // now we will search the target at multiple indexes and add the indices in an array********
    static ArrayList<Integer>list=new ArrayList<>();
    static void findlist(int []arr,int target,int i){
        if(i==arr.length){
            return ;
        }
        if (arr[i]== target) {
            list.add(i);
        }
        findlist(arr, target, i+1); 
    }

    // returnig the arraylist
    static ArrayList finder(int []arr,int target,int i,ArrayList<Integer>list){
        if (i==arr.length) {
            return list;
        }
        if (arr[i]==target) {
           list.add(i);
        }
       return  finder(arr, target, i+1, list);
    }
    // now we will have to take arraylist in the body isntead as parameter
    static ArrayList<Integer> finder2(int []arr,int target, int i){
        // first off all we will declare an array lst;
        ArrayList<Integer>list= new ArrayList<>();
        if (i== arr.length) {
            return list;
        }
        if (arr[i]==target) {
            list.add(i);
        }
        ArrayList<Integer>lissAlltheAnswer=finder2(arr,target,i+1);
        list.addAll(lissAlltheAnswer);
        return list;  }
}
