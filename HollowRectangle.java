import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for (int i=1;i<=b;i++){
            for(int j=1;j<=a;j++){
             // Method one
                if(i==1 || i==b){
                    System.out.print("* ");
                }
                else if (j==1 ||j==a){
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }


    }
}
