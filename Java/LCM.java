import java.util.Scanner;
public class LCM{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num1,num2,i;
        System.out.print("Enter the first number : ");
        num1=sc.nextInt();
        System.out.print("Enter the second number : ");
        num2=sc.nextInt();
        int num=(num1>num2) ? num1:num2;
        for(i=num;i<=num1*num2;i=i+num){
            if(i%num1==0&&i%num2==0){
                break;
            }
        }
        System.out.print("The LCM of "+num1+" and "+num2+" is : "+i);
        sc.close();
    }
}