import java.util.Scanner;

public class AddTwoFractions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter first numerator : ");
        int num1=sc.nextInt();
        System.out.printf("Enter the first denominator : ");
        int den1=sc.nextInt();
        System.out.printf("Enter second numerator : ");
        int num2=sc.nextInt();
        System.out.printf("Enter the second denominator : ");
        int den2=sc.nextInt();
        int num,den,x;
        if (den1==den2){
             num=num1+num2;
             den=den1;
        }
        else {
            num=(num1*den2)+(num2*den1);
            den=den1*den2;
        }
        if(num>den){
            x=num;
        }
        else x=den;
        for(int i=1;i<=x;i++){
            if (num%i==0 && den%i==0){
                num=num/i;
                den=den/i;
            }
        }
        int n=1;
        int a=num;
        int b=den;
        if (num!=den){
            while (n!=0){
                n=num%den;
                if (n!=0){
                    num=den;
                    den=n;
                }

            }
        }

        System.out.print(num1+"/"+den1+"+"+num2+"/"+den2+"="+a/den+"/"+b/den);
        sc.close();
    }
}
