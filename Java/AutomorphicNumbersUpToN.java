import java.util.Scanner;
/*
Automorphic number
Automorphic number is a number whose square ends in the
same digits as the number itself.
Suppose a number 5.
Square of 5 is 25.
and we see that 25 ends in the same digit as the number itself, means 5.
Hence we can conclude that 5 is an Automorphic Number.
Some more Automorphic Numbers are : 5 , 6 , 76 , 376 and 890625.

 */
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
