public class MultipleKnight {
    public static void main(String[] args) {
        int n=4;
        int Knight=3;
        boolean [][]board=new boolean[n][n];
        System.out.println(Knights(board,0,0,Knight));

    }
    static int Knights(boolean [][]board,int row, int col, int Knight){
if (Knight==0) {
    //  printBoard(board);
    //  System.out.println();
    return 1;

}
if (row==board.length) {
    return 0;
}
if (col==board.length) {
   return Knights(board,row + 1,0,Knight);
    
}
// now placing the knights
int count=0;
if (isSafe(board,row,col)) {
    board[row][col]=true;
    count+=Knights(board,row,col+1,Knight-1);
    board[row][col]=false;
}
//if not safe then skip that cell
count+=Knights(board,row,col+1,Knight);
return count;

}
static boolean isSafe(boolean[][]board,int row,int col){
    int[][] moves={
        {-2,-1},{-2,+1},{-1,-2},{-1,+2}
    };
    for(int []TrialMoves:moves){
        int r=row+TrialMoves[0];
        int c=col+TrialMoves[1];
        if (r>=0 &&c>=0 && r<board.length && c<board.length) {
            if (board[r][c]) {
                return false;
            }
        }
    }
    return true;
}
 


}
