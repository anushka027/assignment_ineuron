import java.util.Scanner;

public class SecondProgram {
    public static void main(String args[]){
        int  n,nos=0,i,val,j=0;
    
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of elements in an array");
        n= sc.nextInt();
        int arr[]= new int[n+1];
        int ar[]= new int[n+1];
        System.out.println("Enter the elements of an array");
        for(i=0 ; i<n;i++){
           arr[i]=sc.nextInt();
        }
    
        System.out.println("Enter the value");
        val = sc.nextInt();

        for(i=0;i<n;i++){
            if(arr[i]==val)
            continue;
            else{
                nos++;
                ar[j]=arr[i];
                j++;
            }
        }
        System.out.println("No. of elements not equal to value = "+nos);
        for (int element: ar) {
            System.out.println(element);
        }
}
}
