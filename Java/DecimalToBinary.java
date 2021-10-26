import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number : ");
        int decimal = sc.nextInt();
        int deci = decimal;
        int binary[] = new int[20];
        int n = 0;
        while (decimal > 0) {
            int rem = decimal % 2;
            binary[n++] = rem;
            decimal = decimal / 2;
        }
        System.out.print("The binary of the decimal number " + deci + " is : ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(binary[i]);

        }
        sc.close();
    }
}