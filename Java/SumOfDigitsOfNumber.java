import java.util.Scanner;
public class SumOfDigitsOfNumber{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number=sc.nextInt();
        System.out.print("The sum of digits of "+number+ " is : ");
        int sum=0;
        while(number>0){
            int a=number%10;
            sum=sum+a;
            number=number/10;
        }
        System.out.print(sum);
    }
}
