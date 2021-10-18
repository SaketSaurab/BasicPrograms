#include<stdio.h>
int main()
{
    int firstNumber,secondNumber;
    printf("Enter the two numbers :");
    scanf("%d%d",&firstNumber,&secondNumber);
    if (firstNumber>secondNumber){
        printf("%d number is greater than %d",firstNumber,secondNumber);
    }
    else if (firstNumber<secondNumber){
        printf("%d is greater than %d",secondNumber,firstNumber);
    }
    else
    printf("Both the numbers  are equal");
    
    
    
}