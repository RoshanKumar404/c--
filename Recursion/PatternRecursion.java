public class PatternRecursion {
    public static void main(String[] args) {
        Pattern(5,0);
    }
    static void Pattern(int row,int col){
        if (row==0) {
            return;
        }
        if (col<row) {
            Pattern(row, col+1);
            System.out.print(" * ");
            
        }else{
             Pattern(row-1, 0);
            System.out.println();
           
        }

    }
}
