import java.util.Scanner;
/*this is the simple method to calculate the angel between hands of the clock
eg:
    09:06  =  123.0
    01:56  =  82.0
    11:07  =  68.5
    03:00  =  90.0
But in this program we will give input
 */
public class AngleBetweenHandsOfClock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt(); //enter the time hour
        int m=sc.nextInt(); // enter the time minute
        double hAngle=0.5D*(h*60+m); //angle made by hour hand in one minute is 0.5 degree
        double mAngle=6*m;    //angle made by minute hand in one minute is 6 degree
        double angle=Math.abs(hAngle-mAngle); //we use absolute value to overcome the -ve angle value
        angle=Math.min(angle,360-angle);    //this line assign minimum angle between the hands
        System.out.println(angle);
    }

}
