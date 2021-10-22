import java.util.Scanner;
public class FactorialUpToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num, number;
        long fact=1;
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            number = i;
            fact = 1;
            while (number != 0) {
                fact = fact * number;
                number--;
            }
            System.out.println("The factorial of " + i + " is " + fact);
        }
    }
}
