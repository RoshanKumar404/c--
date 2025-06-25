//Given an array nums of integers, return how many of them contain an even number of digit
public class Problem1295 {
    // public static void main(String[] args) {
    //    int[]arr={15,8,25,64,24};
    // int total=totalnumbers(arr);
    // System.out.println(total); 
    // }
    // //cheking the total number of digits of the number is even or not
    // static int totalnumbers(int[]arr){
    //     int total=0;
    //     for (int num = 0; num < arr.length; num++) {
    //         if (result(num)%2==0) {
    //             total++;
    //         }
            
    //     }
    //     return total;
    // }
    // //counting the digits of the
    // static int result(int num){
    //     int count=0;
    //     while (num>0) {
    //         count++;
    //         num=num%10;
              
    //     }
    //     return count;

    // }
//     public static void main(String[] args) {
//         int[]arr={23,545,5432,54432,543,23};
//         int total=totalnumber(arr);
//         System.out.println(total);

//     }
//     static int totalnumber(int[]arr){
//         int total=0;
//         for (int num:arr) {
//             if (Evencount(num)%2==0) {
//             total++;
//             }
            
//         }
//         return total;

//     }
//     static int Evencount(int num){
//         int counter=0;
//         while (num>0) {
//             counter++;
//             num=num/10;
            
//         }

//         return counter;
//     }
public static void main(String[] args) {
    int[]arr={32,43,2,31,232,4233};
    int totalEvenDigitNumber=EvenNumberCheker(arr);
    System.out.println(totalEvenDigitNumber);
}
static int EvenNumberCheker(int[] arr){
    int total=0;
    for(int num:arr){
if (DigitCounter(num)%2==0) {
    total++;
}
    }
    return total;


}
static int DigitCounter(int num){
    int count=0;
    while (num>0) {
        count++;
        num=num/10;
    }
    return count++;
}

 }



