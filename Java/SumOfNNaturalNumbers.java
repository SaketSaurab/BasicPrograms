import java.util.Scanner;
public class SumOfNNaturalNumbers{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        for(int i=0;i<=a;i++){
            sum=sum+i;
        }
        System.out.println("The sum of first "+a+" numbers is "+sum);
    }
}