#include <iostream>
using namespace std;
int main(){
    int num,a=2;
    cout<<"Enter the number : ";
    cin>>num;
    while(a<num){
        if(num%a==0){
            cout<<"not a prime number";
            break;
        }
        a++;
    }
    if(a==num){
        cout<<"prime number";
    }
}