public class Sudoku {
    
    public static void main(String[] args) {
        
    }
    static boolean solver(int [])
    static boolean isSafe(int[][] board,int row,int col,int num){
        //checking for row
        for(int i=0;i<=board.length;i++){
            if (num==board[row][col]) {
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
        for(int i=rowstart;i<=rowstart+sqrt;i++){
            for(int j=colstart;j<=colstart+sqrt;j++){
                if(board[i][j]==num){
                    return false;
                }
            }
        }

        
        
        return true;
    }
}
