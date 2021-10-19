import java.util.Scanner;
public class PrimeOrNot{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=2;
        while(i<num){
            if(num%i==0){
                System.out.println(num+" is not a prime number");
                break;
            }
            i++;
        }
        if(i==num){
            System.out.println(i+" is a prime number");
        }
    }
}