import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();   //taking input from user
        }
        for (int i=0;i<n-1;i++){
            int min=i;
            {
                for (int j=i;j<n;j++){     //this loop check for minimum element index
                    if (arr[j]<arr[min]){
                        min=j;
                    }
                }
                int temp=arr[i];              //swapping two numbers
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
        for (int elements:arr){   //printing the sorted array using for each loop
            System.out.print(elements+" ");
        }
    }
}
