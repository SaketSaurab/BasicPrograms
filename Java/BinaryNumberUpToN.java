import java.util.Scanner;

public class BinaryNumberUpToN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        System.out.println("Decimal : Binary");
        for (int i=1;i<=num;i++){
             int decimal=i;
            int binary []=new int[30];
            int n=0;
            while (decimal>0){
                int rem=decimal%2;
                binary[n++]=rem;
                decimal= decimal/2;
            }
            System.out.print("     "+i+" :  ");
            for (int j=n-1;j>=0;j--){
                System.out.print(binary[j]);
            }
            System.out.println();
        }

    }
}
