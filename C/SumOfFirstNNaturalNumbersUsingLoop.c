#include<stdio.h>
int main()
{
    int n,sum=0;
    printf("Enter the nubmer :");
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        sum=sum+i;
    }
    printf("The sum of first N natural number is : %d",sum);
}