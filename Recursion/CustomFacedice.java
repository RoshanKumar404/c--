public class CustomFacedice {
    public static void main(String[] args) {
        int[]faces={1,3,5};
        dice(faces,5,"");
        
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
}
