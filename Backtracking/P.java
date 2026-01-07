public class P {
    public static void main(String[] args) {
        int n=4;
        boolean [][]ChessBoard=new boolean[n][n];
        System.out.println(WaystoPlace(0, ChessBoard));
    }
    static int WaystoPlace(int row, boolean [][]ChessBoard){
        if (row==ChessBoard.length) {
            Placed(ChessBoard);
            
            return 1;
        }
        int count=0;
        for(int col=0;col<ChessBoard.length;col++){
            if (isSafe(ChessBoard, row, col)) {
                ChessBoard[row][col]=true;
                System.out.println();
                count+=WaystoPlace(row+1, ChessBoard);
                ChessBoard[row][col]=false;
            }
        }
        return count;
    }
    private static boolean isSafe(boolean[][]ChessBoard,int row,int col){
        // for vertical spaces 
        for(int i=0;i<=row;i++){
            if (ChessBoard[i][col]) {
                return false;
            }
        }
        // for left diagonal
        int MaxLeft=Math.min(row, col);
        for(int i=1;i<=MaxLeft;i++){
            if (ChessBoard[row-i][col-i]) {
                return false;
            }

        }
        //for right diagonal
        // int MaxRight= Math.min(row, ChessBoard.length-col-1);
        // for(int i=1;i<=MaxRight;i++){
        //     if (ChessBoard[row-i][col+i]) {
        //         return false;
                
        //     }
        // }
        return true;
    }

    private static void Placed(boolean[][]ChessBoard){
        for(boolean[]row:ChessBoard){
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
