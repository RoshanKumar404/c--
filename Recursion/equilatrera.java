public class equilatrera {
    
    public static void main(String[] args) {
        upside(0,5, 0);
    }
    static void upside(int row,int col,int space){
        if (row==0) {
            return ;
        }
        if (space<(col-row)) {
            System.out.println(" ");
            upside(row, col, space+1);
            
        }
        else if(col<(2*row-1)){
            System.out.println("*");
            upside(row, col+1, space);
        }
        else{
            System.out.println();
            upside(row-1, 0, 0);
        }

    }
}
