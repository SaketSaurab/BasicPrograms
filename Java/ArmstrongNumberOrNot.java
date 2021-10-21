import java.util.Scanner;
public class ArmstrongNumberOrNot{
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int number=sc.nextInt();
        int sum=0;
        int a=number;
        while(number!=0){
            int b=number%10;
            sum=sum+(b*b*b);
            number=number/10;
        }
        if(sum==a){
            System.out.println(a+" is Armstrong Number");
        }
        else System.out.println(a+" is not Armstrong Number");
    }
}