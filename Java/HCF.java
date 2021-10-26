import java.util.Scanner;
public class HCF{
    public static  void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num1,num2,hcf=1;
        System.out.print("Enter the first number : ");
        num1=sc.nextInt();
        System.out.print("Enter the second number : ");
        num2=sc.nextInt();
        for(int i=1;i<=num1&&i<=num2;i++){
            if(num1%i==0&&num2%i==0){
                hcf=i;
            }
        }
        System.out.println("\nThe HCF of "+num1+" and "+num2+" is "+hcf);
    }
}