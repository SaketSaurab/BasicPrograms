#include<stdio.h>
int main()
{
    int firstNumber,secondNumber,thirdNumber;
    printf("Enter the three numbers :");
    scanf("%d%d%d",&firstNumber,&secondNumber,&thirdNumber);
    if(firstNumber>=secondNumber&&firstNumber>=thirdNumber){
        printf("%d is the greatest among the three numbers",firstNumber);
    }
    else if(secondNumber>=thirdNumber&&secondNumber>=firstNumber){
        printf("%d is the greatest among three ",secondNumber);
    }
    else
    {
        printf("%d is the greatest among the three",thirdNumber);
    }
    
}