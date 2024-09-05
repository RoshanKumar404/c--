#include<iostream>
using namespace std;
int main(){
int array[6]={1,2,3,4,5,6};
// cout<<array[4]<<" value at %d index of array\n";
// printf("value at %d index of the array \n",array[4]);
// cout<<array<<"memory address of the array \n";
int second_array[4];
second_array[2]=3;
// cout<<second_array<<" SECOND ARRAY  memory addr.

cout<<second_array[0]<<" SECOND ARRAY content at index 0 without providing any value \n ";
*second_array=40;

// cout<<second_arra y;
cout<<second_array[0]<<" updated value with the help of  pointer, at index 0 \n ";
int *ap=second_array;
ap++;
*ap=205;
cout<<second_array[1]<<" updated value with the help of  pointer, at index 1 \n ";
ap++;
*ap=300;
cout <<second_array[2]<<"at index 2 "<<endl;

ap++;
*ap=400;
cout<<second_array[3]<<" updated value with the help of  pointer, at index 3 \n ";
 // the following will give un untended results
// ap++;
// *ap=500;
// cout<<second_array[4]<<" updated value with the help of  pointer, at index 4 \n ";

// ap++;
// *ap=600;
// cout<<second_array[5]<<" updated value with the help of  pointer, at index 5 \n ";

// ap++;
// *ap=500;
// cout<<second_array[6]<<" updated value with the help of  pointer, at index 6 \n ";

// ap--;
// *ap=100;
// cout<<*second_array<<" updated value with the help of  pointer, at index 5 \n ";
// cout<<second_array[6]<<" updated value with the help of  pointer, at index 6 \n ";

// ap++;
// *ap=500;
// cout<<second_array[8]<<" updated value with the help of  pointer, at index 8 \n ";

    return 0;
}