import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        String s1=Integer.toString(number);
        int l1=s1.length();
        int square=number*number;
        String s2=Integer.toString(square);
        int l2=s2.length();
        String s3=s2.substring(l2-l1);
        if (s1.equals(s3)){
            System.out.println(number+" is Automorphic Number");
        }
        else {
            System.out.println(number+" is not automorphic number");
        }
    }
}
