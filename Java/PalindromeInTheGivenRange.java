import java.util.Scanner;
public class PalindromeInTheGivenRange{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int count=0;
        int num1=0;
        int num2=0;
        System.out.println("Enter the first number : ");
        int firstNumber=sc.nextInt();
        System.out.println("Enter the second number : ");
        int secondNumber=sc.nextInt();
        for(int i=firstNumber;i<=secondNumber;i++){
            num1=i;
            num2=0;
            while (num1!=0){
                int rem=num1%10;
                num1=num1/10;
                num2=(num2*10)+rem;
            }
            if (i==num2){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}