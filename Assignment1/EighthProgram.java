import java.util.Arrays;
import java.util.Scanner;
public class EighthProgram {
    public static void main(String args[]){
        int  n, i,j,k=0;
    
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of elements in an array");
        n= sc.nextInt();

        int ar[]= new int[n+1];
        int arr[]= new int[n+1];
        System.out.println("Enter the elements of an array");
        for(i=0 ; i<n;i++){
            arr[i]=sc.nextInt();
        Arrays.sort(arr);

        System.out.print("The repeating element is ");
           for(i=0 ; i<n;i++){
            if(arr[i]==arr[i+1]){
                ar[k]=arr[i];
                k++;
                break;
            }
           }
           System.out.print("and the missing element is ");
           for (i = 1; i <= n; i++) {
            if (i != arr[i]) {
              ar[k]=i;
            }}
            for (int element: ar) {
                System.out.println(element);
            }
}
    }
}