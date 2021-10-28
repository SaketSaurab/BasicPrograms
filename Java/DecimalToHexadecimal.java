
import java.util.Scanner;
class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [] ch={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int num=sc.nextInt();
        int rem;
        String hexaDecimal="";
        while (num>0){
            rem=num%16;
            hexaDecimal=ch[rem] + hexaDecimal;
            num=num/16;
        }
        System.out.println(hexaDecimal);
    }
}

