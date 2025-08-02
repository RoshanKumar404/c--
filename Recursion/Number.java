public class Number {
    public static void main(String[] args) {
        printer(1);
    }
    //a function that call itself is Recursion
    static void printer(int n){
        if (n==5) {// this is the base condition , where the
            // recursive call of this fncn will stop
            System.out.println(5);
            return;
        }
       System.out.println(n);
       printer(n+1);
    }//why recursion??
    //it makes solving complex problem simple 
    // it gives a solution of any problem 
    // which we can optimise using iteration
    // or converting  to iterations

    // space complexity is not constant
    // it breaks the complex problem in small problems
      


}
