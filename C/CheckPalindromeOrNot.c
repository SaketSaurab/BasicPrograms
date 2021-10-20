#include<stdio.h>
int main(){
int num,number,a,rem=0;
printf("Enter the number : ");
scanf("%d",&num);
number=num;
while(num>0){
a=num%10;
num=num/10;
rem=(rem*10)+a;
}
if(number==rem){
printf("%d is a palindrome number",number);
}
else{
printf("%d is not a palindrome number",number);
}
}