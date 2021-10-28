import java.util.Scanner;
class HexadecimalNumberUpToN{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int decimal=sc.nextInt();
        for(int i=1;i<=decimal;i++){
            int num=i;
            char []ch={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
            int rem;
            String hexaDecimal="";
            while(num>0){
                rem=num%16;
                hexaDecimal=ch[rem] + hexaDecimal;
                num=num/16;
            }
            System.out.println(i+ " : "+hexaDecimal);
        }
    }
}


