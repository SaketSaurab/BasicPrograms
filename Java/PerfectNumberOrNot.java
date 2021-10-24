import java.util.Scanner;
public class PerfectNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == num) {
            System.out.print("\n " + num + " is a perfect number");
        } else {
            System.out.print("\n" + num + " is  not a perfect number");
        }
    }
}