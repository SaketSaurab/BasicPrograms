import java.util.Scanner;

public class CircumferenceOfCircle {
    public  static float circumference(int r){
        float pi= (float) 3.14;
        float ans=  (2*pi*r);
    return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        float answer=circumference(a);
        System.out.println(answer);
    }
}
