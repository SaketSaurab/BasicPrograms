import java.util.Scanner;
public class BinaryToDecimal{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Binary number : ");
        int binary=sc.nextInt();
        int bin=binary;
        int decimal=0,n=0;
        while(binary>0){
            int temp=binary%10;
            decimal+=temp*Math.pow(2,n);
            binary=binary/10;
            n++;
        }
        System.out.print("The decimal of the binary number "+bin+ " is "+decimal);
        sc.close();
    }
}


