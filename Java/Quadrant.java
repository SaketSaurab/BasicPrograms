import java.util.Scanner;
public class Quadrant{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of X co-ordinate : ");
        int x=sc.nextInt();
        System.out.print("Enter the value of Y co-ordinate : ");
        int y=sc.nextInt();
        if (x==0&&y==0){
            System.out.print("Origin");
        }
        else if(x>0&&y>0){
            System.out.print("("+x+","+y+") lies in 1st Quadrant");
        }
        else if(x<0&&y>0){
            System.out.print("("+x+","+y+") lies in 2nd Quadrant");
        }
        else if(x<0&&y<0){
            System.out.print("("+x+","+y+") lies in 3rd Quadrant");
        }
        else{
            System.out.print("("+x+","+y+") lies in 4th Quadrant");
        }
        sc.close();
    }
}
