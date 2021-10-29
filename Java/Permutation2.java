import java.util.Scanner;
public class Permutation2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of People : ");
        int n=sc.nextInt();
        System.out.print("Enter the number of seats : ");
        int r=sc.nextInt();
        int fact1=1;
        for(int i=n;i>n-r;i--){
            fact1=fact1*i;
        }
        System.out.println(fact1);
        sc.close();
    }
}














