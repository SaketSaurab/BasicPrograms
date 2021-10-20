import java.util.Scanner;
public class PrimeNumbersWithInGivenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the second number:");
        int secondNumber = sc.nextInt();
        System.out.println("The prime numbers between "+firstNumber+ " and "+secondNumber+" are:");

        int count = 0;
        for (int i = firstNumber; i <= secondNumber; i++) {
            int a = 2;
            while (a < i) {
                if (i % a == 0) {
                    break;
                }
                a++;
            }
            if (a == i) {
                System.out.println(i);
                 count++;
            }
        }
        System.out.println("The numbers of prime numbers between "+firstNumber+" and "+secondNumber+" is "+count);
    }
}
