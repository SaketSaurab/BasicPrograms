import java.util.Scanner;
public class NumberDivisibleBy1To10{
    public static void main(String[]args){
        /*
        Smallest number divisible by 1 to  1 is : 1
        Smallest number divisible by 1 to  2 is : 2
        Smallest number divisible by 1 to  3 is : 6
        Smallest number divisible by 1 to  4 is : 12
        Smallest number divisible by 1 to  5 is : 60
        Smallest number divisible by 1 to  6 is : 60
        Smallest number divisible by 1 to  7 is : 420
        Smallest number divisible by 1 to  8 is : 840
        Smallest number divisible by 1 to  9 is : 2520
        Smallest number divisible by 1 to 10 is : 2520
        Smallest number divisible by 1 to 11 is : 27720
        Smallest number divisible by 1 to 12 is : 27720
        Smallest number divisible by 1 to 13 is : 360360
        Smallest number divisible by 1 to 14 is : 360360
        Smallest number divisible by 1 to 15 is : 360360
        Smallest number divisible by 1 to 16 is : 720720
        Smallest number divisible by 1 to 17 is : 12252240
        Smallest number divisible by 1 to 18 is : 12252240
        Smallest number divisible by 1 to 19 is : 232792560
        Smallest number divisible by 1 to 20 is : 232792560
        Smallest number divisible by 1 to 21 is : 232792560
        Smallest number divisible by 1 to 22 is : 232792560
        Smallest number divisible by 1 to 23 is : 5354228880
        Smallest number divisible by 1 to 24 is : 5354228880
        Smallest number divisible by 1 to 25 is : 26771144400
         */

        /*
        (i % 1 == 0) && (i % 2 == 0) && (i % 3 == 0) && (i % 4 == 0) && (i % 5 == 0) && (i % 6 == 0) && (i % 7 == 0) && (i % 8 == 0) && (i % 9 == 0) && (i % 10 == 0)
                        && (i % 11 == 0) && (i % 12 == 0) && (i % 13 == 0) && (i % 14 == 0) && (i % 15 == 0) && (i % 16 == 0) && (i % 17 == 0) && (i % 18 == 0) && (i % 19 == 0) && (i % 20 == 0)
                        && (i % 21 == 0) && (i % 22 == 0) && (i % 22 == 0) && (i % 23 == 0)&&(i%24==0)&&(i%25==0)
         */
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number up which you want to check : ");
        long m=sc.nextLong();
        long count=0;
        long a=1;
        long number;
            for (long i=1;i<=m;i++) {
                if ((i % 1 == 0) && (i % 2 == 0) && (i % 3 == 0) && (i % 4 == 0) && (i % 5 == 0)
                        && (i % 6 == 0) && (i % 7 == 0) && (i % 8 == 0) && (i % 9 == 0)
                        && (i % 10 == 0))
                {
                    System.out.println(i);
                    count++;
                }
            }
        System.out.println("Total numbers divisible by 1 to 10 are :"+count);
    }
}