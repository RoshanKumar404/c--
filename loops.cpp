#include<iostream>
using namespace std;
int main(){

int my_nmber[]={2,4 ,5,6,45,3};
int i =0;
while (i<6){
    if(i==5){
    break;

    }
       cout<< "the number at index "<< i << " is "<< my_nmber[i] +19 <<endl;
       i++;
    


}
cout<<"out of the loop"<<endl;

  return 0;  
};

// #include<iostream>
// using namespace std;

// int main(){
//    int n ;
    
//    cin>>n;
//    int sum=0;
//    for ( int i = 0;  i<= n; i++)
//    {
   
//     sum +=i;
   
//    }
//     cout<<sum;

//     return 0;
// } ;


// #include<iostream>
// using namespace std;
// int main(){

//     int n;
//     cin>>n;
//     double product=1;
//     for (int  i = 1; i <= n; i++)
//     {
//       product*=i;
//     }
    
//     cout<<product;
//     return 0;
// }

// #include<iostream>
// using namespace std;
// int main(){
//     int n;
//     cin>>n;
//     int reversed=0;
//  while (n!=0)
 
 
//     {
//         int digit= n%10;
//         reversed=reversed*10+digit;
//         n/=10;
//     }
//     cout<<reversed;
// }


