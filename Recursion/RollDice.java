import java.util.ArrayList;

public class RollDice {
    public static void main(String[] args) {
        dice(4, "");
        System.out.println(ROllreturn("",4).size());
    }
    
    static void dice(int target, String pro){
        if (target==0) {
            System.out.println(pro);
            return;
        }
        for(int i =1; i<=6&&i<=target;i++){
            dice(target-i, pro+i);
        }
    }
    static ArrayList<String> ROllreturn(String pr, int target){
        if (target==0) {
            ArrayList<String>list=new ArrayList<>();
            list.add(pr);
            System.out.println(pr);
            return list;
        }
        ArrayList<String>list= new ArrayList<>();
        for(int i=1;i<=6&&i<=target;i++){
           
            list.addAll( ROllreturn(pr+i,target-i));
        }
        return list;

    }
    
}
