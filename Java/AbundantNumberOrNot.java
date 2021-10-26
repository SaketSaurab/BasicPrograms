import java.util.Scanner;
/*
An abundant number is a number for which the sum of its proper factors is greater than the number itself

Example :
Suppose an integer value is 24 , then its proper factors are 1, 2, 3, 4, 6, 8, and 12, whose sum is 36. Because 36 is more than
24, the number 24 is abundant. Its abundance is 36 − 24 = 12.

 */

public class AbundantNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum > num) {
            System.out.println(num + " is Abundant Number");
        }
        else {
            System.out.println(num + " is not Abundant Number");
        }
    }
}