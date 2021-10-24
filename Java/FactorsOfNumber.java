import java.util.Scanner;
public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int count=0;
        System.out.print("\nThe factors of the number " + num + " are : ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.print("\n Total numbers of factors are : "+count);
    }
}