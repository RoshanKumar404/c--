public class Nquessn {
    public static void main(String[] args) {
        int n=5;
        boolean[][]chessBoard= new boolean[n][n];
        int Totalways= Nquens(chessBoard, 0);
        System.out.println("The total number of ways to place all queens"+ Totalways);
        Nquens(chessBoard, 0);
    }
    static int Nquens(boolean [][]chessBoard,int row){
        if (row==chessBoard.length) {
            PlacedQuens(chessBoard);
            return 1;

        }
        // trying to place the queen and chwking foe every row and column
        int count=0;
        for(int col=0;col<chessBoard.length;col++){
            if (isSafe(chessBoard,row,col)) {
                chessBoard[row][col]=true;
                System.out.println();
                count+=Nquens(chessBoard, row+1);
                chessBoard[row][col]=false;
            }
        }
        return count;

     }
       private static boolean isSafe(boolean [][]chessBoard, int row, int col ){
        //check vertical row
        for(int i=0;i<row;i++){
            if (chessBoard[i][col]) {
                return false;
            }
        }
        // for left diagonals
        int maxleft= Math.min(row, col);
        for(int i=1;i<=maxleft;i++){
            if (chessBoard[row-i][col-i]) {
                return false;
            }
        }
        //for right diagonal
        int maxRight=Math.min(row,chessBoard.length- col-1);
        for(int i=1;i<=maxRight;i++){
            if (chessBoard[row-i][col+i]) {
                return false;
            }
        }
        return true;
       }

    private static void PlacedQuens(boolean[][] chessBoard){
        for(boolean[]row:chessBoard){
            for(boolean element:row){
                if (element) {
                    System.out.print("Q");
                }else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
