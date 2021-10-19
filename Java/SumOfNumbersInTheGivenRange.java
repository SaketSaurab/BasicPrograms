import java.util.Scanner;
public class SumOfNumbersInTheGivenRange{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int firstNumber=sc.nextInt();
        int secondNumber=sc.nextInt();
        int sum=0;
        for(int i=firstNumber;i<=secondNumber;i++){
            sum=sum+i;
        }
        System.out.println("The sum of numbers between "+firstNumber+" and "+secondNumber+" is "+sum);
    }
}