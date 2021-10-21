#include<stdio.h>
int main()
{
printf("Enter the number: ");
int a,b,c,num,count=2;
scanf("%d",&num);
a=0;
b=1;
printf("0 1");
while(b<=num){
c=a+b;
a=b;
b=c;
if(b<=num){
printf("%d ",b);
count++;
}
}
printf("\nTotal number of fibonacci  numbers up to %d are : %d",num,count);
}

