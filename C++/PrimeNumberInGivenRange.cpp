#include<iostream>
using namespace std;
int main(){
    int num1,num2,num,count=0;
    cout<<"Enter the first number : ";
    cin>>num1;
    cout<<"Enter the second number : ";
    cin>>num2;
    for(int i=num1;i<=num2;i++){
     num=i;
        int div=2;
        while(div<num){
            if(num%div==0){
                break;
            }
            div++;
        }
        if(num==div){
            count++;
            cout<<num<<" ";
        }
        }
        cout<<endl;
        
        cout<<"Total prime numbers between "<<num1<<" and "<<num2<<" is "<<count;
    
}