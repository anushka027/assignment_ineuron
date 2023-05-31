import java.util.Scanner;

public class ThirdProgram {
    public static void main(String args[]){
        int  n, i,target,j;
    
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of elements in an array");
        n= sc.nextInt();
        int arr[]= new int[n+1];
        System.out.println("Enter the elements of an sorted array");
        for(i=0 ; i<n;i++){
           arr[i]=sc.nextInt();
        }
    
        System.out.println("Enter the target value");
        target = sc.nextInt();

        for(i=0; i<n; i++){
            if(arr[i]==target){
                System.out.println("Target element is at "+i);  
                break;
            }
            if(arr[i]>target){
                System.out.println("Expected position of value is at "+(i-1));
                break;
            }
            else{
                continue;
            }
        }
}
}
