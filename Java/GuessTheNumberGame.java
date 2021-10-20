import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the upper limit of the number : ");
        int upperLimit=sc.nextInt();
        Random random=new Random();
        int pc=random.nextInt(upperLimit);
        int count=0;
        int user;
        System.out.print("Guess the number : ");
        do {
             user = sc.nextInt();
            count++;
            if (pc > user) {
                System.out.println("Bigger number please");
            } else if (pc < user) {
                System.out.println("Smaller number please");
            }
            else {
                System.out.println("you guess Right in " + count + " attempt");
            }


        }
        while (pc!=user);

    }
}
