// #include<iostream>
// using namespace std;
// int main(){
//     std::cout<<"ji hujur \n";// is tarah se bhi hm next line print kr skte hai
//      cout<<"jai sri ram " <<std::endl; // or is tarike se bhi
//     return 0;
// }
// // in this we know that why we use namespace std 


// #include<iostream>
// using namespace std;
// int main(){
//     int number;
//     cin>>number;
//     // cout<<number;
//     // cout<<"number is %d"+ number; thus  will not work
//     cout<<"your given number is "<< number+10 << endl;
//   //  printf("your entered number is %d ", number*2);
//     return 0;
// }

// writing a program which take the input from the user and prints the same color with exclamation

#include<iostream>
#include <string>
using namespace std;
int main(){
    string name;
    cout<<"enter your name for greetings";
    getline(cin,name);
    cout<<"hey  dude " <<name<<" is mine    name too"<< endl;

    return 0;
}