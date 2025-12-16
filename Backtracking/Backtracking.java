public class Backtracking {
    public static void main(String[] args) {
        boolean [][]max={{true,true,true},
    {true,true,true},
    {true,true,true}
    };
    // System.out.println();
    backtrack("", max, 0, 0);
    }
    static void backtrack(String pr,boolean[][]maixe,int r, int c){
        if (r==maixe.length-1&& c==maixe[0].length-1) {
            System.out.println(pr);
            return;
            
        }
        if (!maixe[r][c]) {
            return;
        }
        maixe[r][c]=false;
        if (r<maixe.length-1) {
            backtrack(pr+'D', maixe, r+1, c);
        }
        
        if (c<maixe[0].length-1) {
            backtrack(pr+'R', maixe, r, c+1);
        }
        
        if (r>0) {
            backtrack(pr+'U', maixe, r-1, c);
        }
        
        if (c>0) {
            backtrack(pr+'D', maixe, r, c-1);
        }

        maixe[r][c]=true;

    }
    
}
