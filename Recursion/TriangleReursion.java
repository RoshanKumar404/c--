public class TriangleReursion {
    //we need three recursion functions
    //controls oorinting each row
    // prints spaces before printing stars
    //prints stars recursively
    public static void main(String[] args) {
        PrintTriangles(4, 1);
    }
    static void PrintTriangles(int n, int row){
        if (row>n) {
            return;
            
        }
        //this will print spacesbefore stars
        Printspace(n-row);
        printstarts(2*n-1);
        System.out.println();
        PrintTriangles(n,row+1);
    }
    static void Printspace(int count){
      if (count==0) {
        return;
        
      }
      System.out.print(" ");
        Printspace(count-1);
    }
    static void printstarts(int count){
        if (count==0) {
            return;
        }
        System.out.print("*");
        printstarts(count-1);
    }

    
}
