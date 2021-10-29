import java.util.Scanner;

public class Replace0with1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the number : ");
        int num=sc.nextInt();
        String str=Integer.toString(num);
        int len=str.length();
        StringBuilder string= new StringBuilder();
        for (int i=0;i<len;i++){
            if (str.charAt(i)=='0'){
                string.append('1');
            }
            else string.append(str.charAt(i));
        }
        System.out.println(string);
        sc.close();
    }
}
