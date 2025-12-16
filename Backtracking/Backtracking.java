import java.util.Arrays;

public class Backtracking {
    public static void main(String[] args) {
        boolean[][] max = { { true, true, true },
                { true, true, true },
                { true, true, true }
        };
        // System.out.println();
    //    backtrack("", max, 0, 0);
       System.out.println(PathCounter(0, 0, max));
    int [][] arr= new int[max.length][max[0].length];
    BacktracPath("", max, 0, 0, 1, arr);
    }

    // static void backtrack(String pr, boolean[][] maixe, int r, int c) {

    //     if (r == maixe.length - 1 && c == maixe[0].length - 1) {
    //         System.out.println(pr);
    //         return;

    //     }
    //     if (!maixe[r][c]) {
    //         return;
    //     }

    //     maixe[r][c] = false;
    //     if (r < maixe.length - 1) {
    //         backtrack(pr + 'D', maixe, r + 1, c);
    //     }

    //     if (c < maixe[0].length - 1) {
    //         backtrack(pr + 'R', maixe, r, c + 1);
    //     }

    //     if (r > 0) {
    //         backtrack(pr + 'U', maixe, r - 1, c);
    //     }

    //     if (c > 0) {
    //         backtrack(pr + 'L', maixe, r, c - 1);
    //     }

    //     maixe[r][c] = true;

    // }

    static int PathCounter(int r, int c, boolean[][] maxie) {
        if (r < 0 || c < 0 || r >= maxie.length || c >= maxie[0].length) {
            return 0;

        }
        if (!maxie[r][c]) {
            return 0;
        }
        if (r == maxie.length - 1 && c == maxie[0].length - 1) {
            return 1;
        }
        
        maxie[r][c] = false;

        int left = PathCounter(r - 1, c, maxie);
        int right = PathCounter(r, c - 1, maxie);
        int up = PathCounter(r + 1, c, maxie);
        int down = PathCounter(r, c + 1, maxie);

        maxie[r][c] = true;
        return left + right + down + up;

    }

static void BacktracPath(String Pr, boolean [][] maixe, int r, int c, int stage, int[][]arr){
  //always check for out of bounds and this is the condititon check that is need to be done before the recursion call
  if (r<0||c<0||r>=maixe.length||c>=maixe[0].length) {
    return;
  }
  //it blocks the box that has been visited
    if (!maixe[r][c]) {
        return;
    }
    // this is the base case
    if (r==maixe.length-1&&c==maixe[0].length-1) {
        arr[r][c]=stage;
        for(int []path:arr){
            System.out.println(Arrays.toString(path));
        }
        
        System.out.println(Pr);
        System.out.println();
        return;
    }
// marking the box visited
    maixe[r][c]=false;

    arr[r][c]=stage;
    // now the function calls
    BacktracPath(Pr+'D', maixe, r+1, c, stage+1, arr);
    BacktracPath(Pr+'R', maixe, r, c+1, stage+1, arr);
    BacktracPath(Pr+'U', maixe, r-1, c, stage+1, arr);
    BacktracPath(Pr+'L', maixe, r, c-1, stage+1, arr);
   
    // if (r<maixe.length-1) {
        
    // }
    // if (c<maixe[0].length-1) {
       
    // }
    // if (c>0) {
       
        
    // }
    // if (r>0) {
       
    // }
     maixe[r][c]=true;
     arr[r][c]=0;
}
}
