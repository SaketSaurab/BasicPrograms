#include<iostream>
using namespace std;
int main(){
    cout<< "Enter the number : ";
    int num;
    cin>>num;
    if (num>0){
        cout<<"The number is positive";
    }
    else if (num<0){
        cout<<"The number is negative";
    }
    else cout<<"The number is 0";

    
}