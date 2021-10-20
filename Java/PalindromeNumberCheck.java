import java.util.Scanner;
public class PalindromeNumberCheck{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number=sc.nextInt();
        int a,b,d=0;
        b=number;
        while(number>0){
            a=number%10;
            number=number/10;
            d=(d*10)+a;
        }
        if(b==d){
            System.out.println(b+" is a palindrome");
        }
        else System.out.println(b+" is not a palindrome");
    }
}

