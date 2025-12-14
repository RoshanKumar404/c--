import java.util.ArrayList;

public class CustomFacedice {
    public static void main(String[] args) {
        int[]faces={1,3,5};
//dice(faces,5,"");
        System.out.println(Dicereturn("", faces, 4).size());
        
    }
    static void dice(int []faces,int target,String pr){
        if (target==0) {
            System.out.println(pr);
            return;

        }
        for(int face:faces){
            if (face<=target) {
                dice(faces,target-face,pr+face);
            }
        }
    }
    static ArrayList<String>Dicereturn(String pr,int [] faces,int target){
        if (target==0) {
            ArrayList<String>list= new ArrayList<>();
            list.add(pr);
            return list;
        }
        ArrayList<String>result=new ArrayList<>();
        for(int face:faces){
            if (face<=target) {
                result.addAll(Dicereturn(pr+face, faces, target-face));
            }
        }
        return result;
    }
}
