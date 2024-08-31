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

// referncing
// int score=38;
// int *mypointer=&score;

// printf("value of score in %d is \n", score);
// printf("address of the score which is pointed by  mypointer %p is \n" , mypointer
// );

// int &refrence= score;
// refrence=500;
// printf(" updated value of score in %d is \n", score);
// printf("value of the score which is pointed by  mypointer %p is \n" , mypointer
// );
    return 0;
}