#include<stdio.h>
int main()
{
    int n,i;
    printf("Enter the number: ");
    scanf("%d",&n);
    i=2;
    while(i<=n-1)
    {
        if(n%i==0){
            printf("%d is not a prime number",n);
            break;
        }
        i++;
    }
    if(n==i){
        printf("%d is prime number",n);
    }

}
