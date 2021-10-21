import java.util.Scanner;
public class FibonacciSeriesUpToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int a = 0, b = 1, c,count=2;
        System.out.print(a + " " + b + " ");
        while (b <= num) {
            c = a + b;
            a = b;
            b = c;

            if (b <= num) {
                System.out.print(b + " ");
                count++;
            }

            sc.close();
        }
        System.out.print("\nTotal numbers in fibonacci series up to "+num+" is "+count);
    }
}