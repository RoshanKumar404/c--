 public interface binarySearch {
//     public static void main(String[] args) {
//         int[]Sortedarray={50,40,30,20,10,9,8,76,5,4,3,2,1};
//         int target=4;
// System.out.println(BinarySearch(Sortedarray, target));
// }
// // all the changes made were for the array that is in descending order
// static int BinarySearch(int[]Sortedarray,int target){
//     int Start=0;
//     int endpoint=Sortedarray.length-1;
//     while (Start<=endpoint) {
//         int midElement= Start+(endpoint-Start)/2;
//         if (target<Sortedarray[midElement]) {
//             Start=midElement+ 1;
//         }
//         else if(target>Sortedarray[midElement]){
           
//              endpoint=midElement-1;
//         }
//         else{
//             return midElement;
//         }
//     }
//     return -1;
// }

 
// how to find the arraey is in Ascending order or descending order

//*** my  logic is if the 1st element is grater than the last one then it is "Ascendig order" else its in "decending" order


// public static void main(String[] args) {
//     int[]arr= {14,13,12,11,10,9,8,7,6,5};
//     int target=5;
//     int start=0;
//     int end=arr.length-1;
    

//     if( arr[start]<arr[end]){
//         System.out.println("the array is in ascending order " + AscendingOrderSearch(arr,target) )  ;
//     }else{
//         System.out.println("the array is in descending order: " + DescendingOrderSearch(arr,target));
//     }
// }
// static int AscendingOrderSearch(int[] arr , int target){
//      int start=0;
//     int end=arr.length-1;
//     while (start<=end) {
//     int midpoint=start+(end-start)/2;
//         if (target>arr[midpoint]) {
//             start=midpoint+1; 
//         }else if (target<arr[midpoint]) {
//             end=midpoint-1;  
//         }else{
//             return midpoint;
//         }
//     }
//     return -1;

// }
// static int DescendingOrderSearch(int[] arr , int target){
//      int start=0;
//     int end=arr.length-1;
//      while (start<=end) {
//     int midpoint=start+(end-start)/2;
//         if (target>arr[midpoint]) {
           
//              end=midpoint-1;
//         }else if (target<arr[midpoint]) {
//               start=midpoint+1; 
//         }else{
//             return midpoint;
//         }
//     }
//     return -1;

// };

public static void main(String[] args) {
     int[] arr1 = {1, 3, 5, 7, 9, 11}; // Ascending
        int[] arr2 = {11, 9, 7, 5, 3, 1}; // Descending

        int target = 5;

        System.out.println("Index in ascending: " + orderAgnosticBinarySearch(arr1, target));
        System.out.println("Index in descending: " + orderAgnosticBinarySearch(arr2, target)); 
}
static int orderAgnosticBinarySearch(int[]arr,int target){
    int start=0;
    int end=arr.length-1;
    boolean isAscending=arr[start]<arr[end];
    while (start<=end) {
        int mid= start+(end-start)/2;
        if (arr[mid]==target) {
            return mid;
        }
        if (isAscending) {
            if (target<arr[mid]) {
                end=mid-1;
            }else{
                start=mid+1;
            }
        }else{
            if (target>arr[mid]) {
                end=mid-1;
            }else{
                start= mid+1;
            }
        }
    }
    return -1;
}

 }