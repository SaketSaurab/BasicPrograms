import java.util.Scanner;
public class HarshadNumberUpToN{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        int count=0;
        for (int i=1;i<=num;i++){
            int sum=0;
            int number=i;
            while (number!=0){
                int a=number%10;
                sum=sum+a;
                number=number/10;
            }
            if (i%sum==0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total harshad number up to "+num+" is "+count);
    }
}