public class Sudoku {
    
    public static void main(String[] args) {
        int [][]board=new int[][]{
            {3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 1, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 4, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 7, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        if (solver(board)) {
           //  System.out.println(solver(board));
           display(board);
        }else{
            System.out.println("unable to solve");
        }
       
    }
    static boolean solver(int [][]board){
        int n= board.length;
        int row= -1;
        int col=-1;
        boolean emptyleft=true;
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++ ){
                if (board[i][j]==0) {
                    row=i;
                    col=j;
                    emptyleft=false;
                    break;
                }
            }
            if (emptyleft==false) {
                break;
            }
        }
        if (emptyleft==true) {
            return true;
        }

        for (int number = 1; number <=9; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col]=number;
                if (solver(board)) {
                  //  display(board);
                    return true;
                }else{
                    board[row][col]=0;
                }


            }
        }
        return false;

    }
    private static void display(int[][]board){
        for (int []row : board) {
            for ( int num : row)  {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
    static boolean isSafe(int[][] board,int row,int col,int num){
        //checking for row
        for(int i=0;i<board.length;i++){
            if (num==board[row][i]) {
                return false;
            }
        }
        //checking for columns
        for(int []nums:board){
            if (nums[col]==num) {
                return false;
            }
        }
        //these things are for the 3X3 box
        int sqrt=(int)(Math.sqrt(board.length));
        int rowstart= row-row%sqrt;
        int colstart= col-col%sqrt;
        for(int i=rowstart;i<rowstart+sqrt;i++){
            for(int j=colstart;j<colstart+sqrt;j++){
                if(board[i][j]==num){
                    return false;
                }
            }
        }

        
        
        return true;
    }
}
