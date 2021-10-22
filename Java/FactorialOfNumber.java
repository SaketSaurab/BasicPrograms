import java.util.Scanner;
public class FactorialOfNumber{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int number=sc.nextInt();
        long fact=1;
        int num=number;
        while(number!=0){
            fact=fact*number;
            number--;
        }
        System.out.println("The factorial of "+num+" is "+fact);
    }
}



