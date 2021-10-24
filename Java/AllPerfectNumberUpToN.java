import java.util.Scanner;
public class AllPerfectNumberUpToN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter  the number up which you want to check for perfect number : ");
        int n=sc.nextInt();
        for (int i=2;i<=n;i++){
            int sum=0;
            for (int j=1;j<i;j++){
                if (i%j==0){
                    sum=sum+j;
                }
            }
            if (i==sum){
                System.out.println(i);
            }
        }
    }
}
