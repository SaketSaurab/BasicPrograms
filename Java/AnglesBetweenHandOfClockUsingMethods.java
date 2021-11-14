import java.util.Scanner;
/*this is the simple method to calculate the angel between hands of the clock
eg:
    09:06  =  123.0
    01:56  =  82.0
    11:07  =  68.5
    03:00  =  90.0
But in this program we will give input
 */
public class AnglesBetweenHandOfClockUsingMethods {
    public static double angle(String time) {
        String []arr=new String[2];
        arr=time.split(":");
        int h=Integer.parseInt(arr[0]);
        int m=Integer.parseInt(arr[1]);
        double hAngle=0.5*(60*h+m);
        double mAngle=6*m;
        double angle=Math.abs(hAngle-mAngle);
        angle =Math.min(angle,360-angle);
        return angle;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String time=sc.next();
        double angle=angle(time);
        System.out.println(angle);
    }
}
