public class MaizeProblem {
    public static void main(String[] args) {
       System.out.println(maizeCount(3,3));
    }

    static int maizeCount(int row, int column){
        if (row==1 || column==1) {
            return 1;
        }
        int left= maizeCount(row-1, column);
        int right= maizeCount(row, column-1);
        return left+right;
    }
    
}
