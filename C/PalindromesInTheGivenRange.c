#include<stdio.h>
int main(){
int firstNumber,secondNumber,num1=0,rem,a,count=0;
printf("Enter the first number :");
scanf("%d",&firstNumber);
printf("Enter the second number:");
scanf("%d",&secondNumber);
for(int i=firstNumber;i<=secondNumber;i++){
num1=i;
rem=0;
while(num1!=0){
 a=num1%10;
num1=num1/10;
rem=(rem*10)+a;
}
if(i==rem){
printf("%d \n",i);
count++;
}
}
printf("%d",count);

}