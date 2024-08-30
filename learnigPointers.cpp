#include<iostream>
using namespace std;
int main(){
//     int card=30;
// int *poin;
// poin=&card;
// cout<<"the value of poin %p "<<poin ;

// printf("\n your memory address is %p", poin);

int memAdd= 3403;
int defmem=memAdd;
int *memspointer=&memAdd;
defmem=*memspointer;
cout<<memAdd;
printf("\n your memory address is %p  \n",memspointer);
cout<<defmem;

    return 0;
}