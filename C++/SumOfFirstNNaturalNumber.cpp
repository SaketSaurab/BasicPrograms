#include<iostream>
using namespace std;
int main(){
    int sum=0,num;
    cout<<"Enter the number : ";
    cin>>num;
    for (int  i = 0; i <=num; i++)
    {
        sum=sum+i;
    }
    cout<<"The sum of  is : "<<sum;
    
}