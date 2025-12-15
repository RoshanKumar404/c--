public class MaizeProblem {
    public static void main(String[] args) {
       System.out.println(maizeCount(3,3));
       path("", 3, 3);
    }

    static int maizeCount(int row, int column){
        if (row==1 || column==1) {
            return 1;
        }
        int left= maizeCount(row-1, column);
        int right= maizeCount(row, column-1);
        return left+right;
    }
    static void path(String Pr,int row,int column){
        if (row==1&&column==1) {
            System.out.println(Pr);
            return;
        }
        if (row>1) {
            path(Pr+'d', row-1, column);
        }
        if (column>1) {
            path(Pr+'r', row, column-1);
        }
    }
    
}
