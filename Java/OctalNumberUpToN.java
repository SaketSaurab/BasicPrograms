import java.util.Scanner;
public class OctalNumberUpToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        for (int i=1;i<=num;i++){
            int decimal=i;
            int[] octal =new int[20];
            int n=0;
            while (decimal>0){
                int rem=decimal%8;
                octal[n++]=rem;
                decimal=decimal/8;
            }
            System.out.print(i+" :  ");
            for (int j=n-1;j>=0;j--){
                System.out.print(octal[j]);
            }
            System.out.println();
        }
        sc.close();
    }
}