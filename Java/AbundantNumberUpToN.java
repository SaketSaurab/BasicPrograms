import java.util.Scanner;
/*
An abundant number is a number for which the sum of its proper factors is greater than the number itself

Example :
Suppose an integer value is 24 , then its proper factors are 1, 2, 3, 4, 6, 8, and 12, whose sum is 36. Because 36 is more than
24, the number 24 is abundant. Its abundance is 36 − 24 = 12.

 */
public class AbundantNumberUpToN{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n=sc.nextInt();
        int count=0;
        for(int i=2;i<=n;i++){
            int num=i;
            int sum=0;
            for(int j=1;j<=num/2;j++){
                if(num%j==0){
                    sum=sum+j;
                }
            }
            if(sum>num){
                System.out.println(num);
                count++;
            }
        }
        System.out.println("Total number of Abundant number up to "+n+" is "+count);
    }
}