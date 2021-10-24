import java.util.Scanner;
public class StrongNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int fact, sum = 0, d = num;
        while (num!=0) {
            fact=1;
           int a = num % 10;
            for (int i=a;i>0;i--){
                fact = fact * i;
            }
            sum = sum + fact;
            num = num / 10;
        }
        if (d == sum) {
            System.out.print("\n " + d + " is strong number");
        } else {
            System.out.print("\n" + d + " is not a strong number ");
            sc.close();
        }
    }
}