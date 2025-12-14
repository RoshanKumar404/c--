public class RollDice {
    public static void main(String[] args) {
        dice(4, "");
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
    
}
