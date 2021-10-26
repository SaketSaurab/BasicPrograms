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
public class HarshadNumberUpToN{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        int count=0;
        for (int i=1;i<=num;i++){
            int sum=0;
            int number=i;
            while (number!=0){
                int a=number%10;
                sum=sum+a;
                number=number/10;
            }
            if (i%sum==0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total harshad number up to "+num+" is "+count);
    }
}