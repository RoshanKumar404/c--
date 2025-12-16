import java.util.ArrayList;

public class MaizeProblem {
    public static void main(String[] args) {
        // System.out.println(maizeCount(4,4));
        // path("", 4, 4);
        // System.out.println(path("", 4, 4););
        //System.out.println(Pathreturn("", 3, 3).size());
        boolean[][] maixe={{true,false,true},
                          {true  ,true,false},
                          {true,true,true}};
                          BlockedPath("", maixe, 0, 0);
    }

    static int maizeCount(int row, int column) {
        if (row == 1 || column == 1) {
            return 1;
        }
        int left = maizeCount(row - 1, column);
        int right = maizeCount(row, column - 1);
        return left + right;
    }

    static void path(String Pr, int row, int column) {
        if (row == 1 && column == 1) {
            System.out.println(Pr);
            return;
        }
        if (row > 1) {
            path(Pr + 'd', row - 1, column);
        }
        if (column > 1) {
            path(Pr + 'r', row, column - 1);
        }

    }

    static ArrayList<String> Pathreturn(String Pr, int row, int colum) {
        if (row == 1 && colum == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(Pr);
            System.out.println(Pr);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (row > 1 && colum > 1) {
            list.addAll(Pathreturn(Pr + 'V', row - 1, colum - 1));
        }
        if (row > 1) {
            list.addAll(Pathreturn(Pr + 'D', row - 1, colum));
        }
        if (colum > 1) {
            list.addAll(Pathreturn(Pr + 'R', row, colum - 1));
        }
        return list;
    }

    static void BlockedPath(String pr, boolean[][] maize, int r, int c) {
        if (r == maize.length - 1 && c == maize[0].length - 1) {
            System.out.println(pr);
            return;
        }
        if (!maize[r][c]) {
            return;
        }
        if (r<maize.length-1) {
            BlockedPath(pr+'D', maize, r+1, c);
        }
         if (c<maize[0].length-1) {
            BlockedPath(pr+'R', maize, r, c+1);
        }
    }

}
