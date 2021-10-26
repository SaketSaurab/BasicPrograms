import java.util.Scanner;
public class FindFriendlyPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int limit = sc.nextInt();
        int count = 0;
        int sum1 = 0, sum2;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum1 = sum1 + i;
            }
        }
        for (int j = 2; j <= limit; j++) {
            sum2 = 0;
            for (int k = 1; k < j; k++) {
                if (j % k == 0) {
                    sum2 = sum2 + k;

                }
            }

            if (num == sum2 && j == sum1) {
                System.out.println("Friendly pair of "+num+" is : "+j);
            }
        }
    }
}

