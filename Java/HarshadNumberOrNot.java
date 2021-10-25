import java.util.Scanner;
public class HarshadNumberOrNot{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        int number=num;
        int sum=0;
        while(num!=0){
            int a=num%10;
            sum=sum+a;
            num=num/10;
        }
        if(number%sum==0){
            System.out.print("\n "+number+" is Harshad Number");
        }
        else{
            System.out.print("\n "+number+" is not Harshad Number");
        }
    }
}