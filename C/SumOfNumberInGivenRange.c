#include<stdio.h>
int main()
{
    int firstNumber,secondNumber,sum=0;
    printf("Enter the two numbers :");
    scanf("%d%d",&firstNumber,&secondNumber);
    for(int i=firstNumber;i<=secondNumber;i++){
        sum=sum+i;
    }
    printf("The sum of the numbers is :%d",sum);
}