import java.util.Scanner;
public class TotalHandshake{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Total number of people : ");
        int n=sc.nextInt();
        /*
        total handshakes is calculated using ncr formula
        n=total number of people and r = 2 which is hands
         */
        int total=(n*(n-1))/2;
        System.out.print("Total number of handshakes = "+total);
        sc.close();
    }
}