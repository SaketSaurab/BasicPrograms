import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        System.out.print("Enter the decimal number : ");
        Scanner sc=new Scanner(System.in);
        int decimal=sc.nextInt();
        int num=decimal;
        int n=0;
        int octal[]=new int[20];
        while (decimal > 0) {
            int rem=decimal%8;
            octal[n++]=rem;
            decimal=decimal/8;
        }
        System.out.print("The octal number of "+num+" is : ");
        for (int i=n-1;i>=0;i--){
            System.out.print(octal[i]);
        }
    }
}
