#include<stdio.h>
int main(){
int num,number,a,rem;
printf("Enter the number : ");
scanf("%d",&num);
number=num;
while(num!=0){
a=num%10;
num=num/10;
rem=(rem*10)+a;
}
printf("The reverse of the number %d is %d",number,rem);
}