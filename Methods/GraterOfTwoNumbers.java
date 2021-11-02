import java.util.Scanner;

public class GraterOfTwoNumbers {
    public static int greater(int a,int b){
        if (a>b){
            return a;
        }
        else return b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int bigger=greater(x,y);
        System.out.println(bigger);
    }
}
