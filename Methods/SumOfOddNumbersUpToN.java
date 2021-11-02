import java.util.Scanner;

public class SumOfOddNumbersUpToN {
    public static int sumOfOdd(int a){
        int sum=0;
        for (int i=1;i<=a;i++){
            if (i%2==1){
                sum+=i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=sumOfOdd(n);
        System.out.println(sum);
    }
}
