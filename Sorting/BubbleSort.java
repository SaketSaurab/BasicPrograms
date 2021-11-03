import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        for (int i=0;i<n;i++){       // this look is for taking input from user
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n-1;i++){
            boolean sorted=true;   //condition to check array is sorted or not
            for (int j=0;j<n-1-i;j++){
                if (arr[j+1]<arr[j]){     //checking condition
                    int temp=arr[j+1];    //swapping using third variable
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    sorted=false;
                }
            }
            if (sorted) break;   // if array is sorted it will break the loop
        }
        for (int elements:arr){  //using for each loop
            System.out.print(elements+" ");   //printing the sorted array
        }
    }
}
