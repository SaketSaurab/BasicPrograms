import java.util.Scanner;
public class ArmstrongNumbersInTheGivenRange{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber=sc.nextInt();
        System.out.println("Enter the second number:");
        int secondNumber=sc.nextInt();
        int count=0;
        for(int i=firstNumber;i<=secondNumber;i++){
            int num1=i;
            int sum=0,a;
            while(num1!=0){
                a=num1%10;
                sum=sum+(a*a*a);
                num1=num1/10;
            }
            if(i==sum){
                System.out.println(sum);
                count++;
            }
        }
        System.out.println(count);
    }
}