#include<stdio.h>
int main(){
int number,num1,num2,rem,result,count=0;
printf("Enter the first number: ");
scanf("%d",&num1);
printf("Enter the second number :");
scanf("%d",&num2);
for(int i=num1;i<=num2;i++){
result=0;
number=i;
while(number!=0){
rem=number%10;
result=result+(rem*rem*rem);
number=number/10;
}
if(i==result){
printf("%d ",i);
count++;
}
}
printf("\nTotal number of armstrong numbers between %d and %d are %d",num1,num2,count);
}