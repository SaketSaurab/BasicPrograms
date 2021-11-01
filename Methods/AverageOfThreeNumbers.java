import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static  int Average(int a,int b,int c){
        int sum=a+b+c;
        int avg=sum/3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int average=Average(x,y,z);
        System.out.println(average);
    }
}
