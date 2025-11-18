public class equilatrera {
    
    public static void main(String[] args) {
        upside(5,0, 0);
    }
    static void upside(int row,int col,int space){
        if (row==0) {
            return ;
        }
        if (space<(row-col)) {
            System.out.print(" ");
            upside(row, col, space+1);
            
        }
        else if(col<(2*row-1)){
           
            
             System.out.print("*");
             upside(row, col+1, space);
        }
        else{
           
            
             System.out.println();
             upside(row-1, 0, 0);
        }

    }
}
