import java.util.Scanner;
/*

this program is not working

 */
public class FriendlyPairNumberUpToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum1, sum2;
        for (int i = 0; i <= num; i++) {
            sum1 = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum1 = sum1 + j;
                }
            }

            for (int x = 0; x < num * 10; x++) {
                sum2 = 0;
                for (int y = 1; y < x; y++) {
                    if (x % y == 0) {
                        sum2 = sum2 + y;
                    }
                }
                if (num == sum2 && x == sum1) {
                    System.out.println(num + " " + sum2 + " " + x + " "+sum1);
                }
            }
        }
    }
}