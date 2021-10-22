#include<stdio.h>
int main(){
int num,number,a,sum=0;
printf("Enter the number : ");
scanf("%d",&num);
number=num;
while(number!=0){
a=number%10;
sum=sum+(a*a*a);
number=number/10;
}
if(num==sum){
printf("%d is armstrong number",num);
}
else {
printf("%d is not armstrong number",num);
}
}