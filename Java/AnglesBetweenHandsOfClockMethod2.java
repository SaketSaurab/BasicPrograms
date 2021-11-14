import java.util.Scanner;
/*this is the simple method to calculate the angel between hands of the clock
eg:
    09:06  =  123.0
    01:56  =  82.0
    11:07  =  68.5
    03:00  =  90.0
But in this program we will give input
 */
public class AnglesBetweenHandsOfClockMethod2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String time=sc.next();   //here we will input the time like 09:06
        String[]arr=new String[2];
        arr=time.split(":");  //here it will divide the hour and minute by using split :
        int h=Integer.parseInt(arr[0]);
        int m=Integer.parseInt(arr[1]);
        double hAngle=0.5D*(h*60+m);
        double mAngle=6*m;
        double angle=Math.abs(hAngle-mAngle);
        angle=Math.min(angle,360-angle);
        System.out.println(angle);
    }
}
