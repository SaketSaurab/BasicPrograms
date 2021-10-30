#include<iostream>
using namespace std;
int main(){
    int num1,num2,sum=0;
    cout<<"Enter the  lower limit : ";
    cin>>num1;
    cout<<"Enter the upper limit : ";
    cin>>num2;
    if(num1<num2){
    for(int i=num1;i<=num2;i++){
        sum=sum+i;
    }
    cout<<"The sum is : "<<sum;
    }
    else cout<<"first number must be smaller than the second number";
}