import java.util.Scanner;
public class Permutation{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of People : ");
        int n=sc.nextInt();
        System.out.print("Enter the number of seats : ");
        int r=sc.nextInt();
        int fact1=1;
        int fact2=1;
        for(int i=n;i>=1;i--){
            fact1=fact1*i;
        }
        for(int j=n-r;j>=1;j--){
            fact2=fact2*j;
        }
        int ways=fact1/fact2;
        System.out.print("Total number of ways of sitting "+n+" people on "+r+" chair is : "+ways+" ways");
        sc.close();
    }
}














