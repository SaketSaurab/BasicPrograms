import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random a=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the maximum limit of the numbers : ");
        int limit=sc.nextInt();
        int number=a.nextInt(limit);
        System.out.println(number);
    }
}
