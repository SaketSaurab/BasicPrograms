import java.util.Scanner;

public class AutomorphicNumbersUpToN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long count=0;
        for (long i=1;i<=n;i++){
            String s1=Long.toString(i);
            long l1=s1.length();
            long square=i*i;
            String s2=Long.toString(square);
            long l2=s2.length();
            String s3=s2.substring((int) (l2-l1));
            if (s1.equals(s3)){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total : "+count);
    }
}
