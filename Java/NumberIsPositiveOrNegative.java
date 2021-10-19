import java.util.Scanner;

public class NumberIsPositiveOrNegative {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        if (a>0){
            System.out.println(a+" is positive number");
        }
        else if(a<0){
            System.out.println(a+" is negative number");
        }
        else System.out.println("The number is equal to zero");
    }
}
