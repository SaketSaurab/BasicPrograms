import java.util.Scanner;
public class GreatestOfTwoNumbers{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int firstNumber=sc.nextInt();
        int secondNumber=sc.nextInt();
        if(firstNumber>secondNumber){
            System.out.println(firstNumber+" is greater than "+secondNumber);
        }
        else if(secondNumber>firstNumber){
            System.out.println(secondNumber+" is greater than "+firstNumber);
        }
        else{
            System.out.println("Both the numbers are equal");
        }
    }
}