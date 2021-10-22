import java.util.Scanner;
public class PowerOfANumber{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int base,exponent,exponentt;
        long result=1;
        System.out.print("Enter the base value : ");
        base=sc.nextInt();
        System.out.print("\n Enter the exponent value : ");
        exponent=sc.nextInt();
        exponentt=exponent;
        while(exponent!=0){
            result=result*base;
            exponent--;
        }
        System.out.print("\n The value of the base "+base+" and exponent "+exponentt+" is "+result);
    }
}