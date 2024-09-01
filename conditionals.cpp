#include<iostream>
using namespace std;
int main(){
    int rating;

    puts("please rate our service");
     cin >> rating;

//     if (rating==1){
//         cout<<" Disappointed with the service \n";
//     }else if(rating==2  ){
// cout<<"bad service you have "<<endl;3
//     } else if(rating==3){
//        printf("not bad service ");

//     }else if(rating==4){
//         cout<<"good service maintained ";
//     }else if(rating==5){
//         cout<<"very good service maintained ";
//     }else{
//         printf("provide rating  between 1 to 5 only");
//     }
cout<< (rating>0 && rating<=5?"done":"nothing")<<endl;
return 0;
}