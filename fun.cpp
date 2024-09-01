#include<iostream>
using namespace std;
int main(){

    // by this we can use conversion without doing manually 
   // int fun = 0b100101; // here 0b is denoted for binaary and other digits are binary of any number (37_)
   int fun= 0x19;  // here 0x denotes hexadecimal  and 19 is the hexadecimal representation of the number 25
    printf("the value of fun is %d", fun);

    return 0;
}