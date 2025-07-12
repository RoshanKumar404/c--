public class bubleProblem1 {
  public static void main(String[] args) {
    int arr;
    var sortBy = function(arr, fn) {
  return arr.slice().sort((a, b) => fn(a) - fn(b));
};
  }


}
