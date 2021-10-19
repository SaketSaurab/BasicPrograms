import java.util.Scanner;
public class SumOfFirstNNaturalNumbers{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=a*(a+1)/2;
        System.out.println("The sum of first "+a+" numbers is "+sum);
    }
}