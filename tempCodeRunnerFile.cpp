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

// cout<<second_array;
cout<<second_array[0]<<" updated value with the help of  pointer, at index 0 \n ";