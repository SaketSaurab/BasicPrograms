import java.util.Scanner;
/*
Friendly Pair are two natural numbers whose sum of factors of
 first number and sum of factors of second number is equal to
second number and first number respectively.

In other words, Sum of factors of first number is equal to the
 second number and Sum of factors of second number is equal to
the first number.

Example :
Suppose two numbers 220 and 284.
Factors of both numbers :
– Factors of 220 = 1 , 2 , 4 , 5 , 10 , 11 , 20 , 22 , 44 , 55 and 110 ;
– Factors of 284 = 1 , 2 , 4 , 71 and 142.
Sum of factors of both numbers :
– Sum of factors of 220 =
1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284
– Sum of factors of 284 =
1 + 2 + 4 + 71 + 142 = 220

*/
public class FriendlyPairOrNot{
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1,num2,sum1=0,sum2=0;
        num1=sc.nextInt();
        System.out.print("Enter the secon number : ");
        num2=sc.nextInt();
        for(int i=1;i<num1;i++){
        if(num1%i==0){
        sum1=sum1+i;
        }
        }
        for(int j=1;j<num2;j++){
        if(num2%j==0){
        sum2=sum2+j;
        }
        }
        if(sum1==num2&&sum2==num1){
        System.out.println(num1+" and "+num2+" are Friendly pair number.");
        }
        else
        {
        System.out.println(num1+" and "+num2+ " are not friendly pair number.");
        }
        }
        }