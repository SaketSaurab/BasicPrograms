#include<stdio.h>
int main()
{
    int firstNumber,secondNumber,count=0;
    printf("Enter two numbers : ");
    scanf("%d%d",&firstNumber,&secondNumber);
    for(int i=firstNumber;i<=secondNumber;i++){
        int a=2;
      
        while(a<=i-1){
           if(i%a==0){
               break;
           }
           a++;
        }
        if(a==i){
             
            printf("%d,",a);
             count++;
          
        }
      
      
    }
     printf("The number of prime numbers between %d and %d is = %d",firstNumber,secondNumber,count);
     
}