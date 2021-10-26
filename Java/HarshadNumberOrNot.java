import java.util.Scanner;
/*
Harshad number is a number or an integer in base 10
 which is completely divisible by sum of its digits

 Suppose a number 24 .
Calculate the sum of digits of the number (2 + 4) = 6 .
Check whether the number entered by user is completely
divisible by sum of its digits or not.

1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 18, 20………
 */
public class HarshadNumberOrNot{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        int number=num;
        int sum=0;
        while(num!=0){
            int a=num%10;
            sum=sum+a;
            num=num/10;
        }
        if(number%sum==0){
            System.out.print("\n "+number+" is Harshad Number");
        }
        else{
            System.out.print("\n "+number+" is not Harshad Number");
        }
    }
}