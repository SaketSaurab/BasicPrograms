import java.util.Scanner;
public class ReverseANumber{
    public  static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a,b,number,d=0;
        a=sc.nextInt();
        number=a;
        while(a>0){
            b=a%10;
            a=a/10;
            d=(d*10)+b;
        }
        System.out.println("Reverse of "+number+" is : "+d);
    }
}