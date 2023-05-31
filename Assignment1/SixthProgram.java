import java.util.Scanner;
public class SixthProgram {
    public static boolean main(String args[]){
        int  n, i,j,k;
    
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of elements in an array");
        n= sc.nextInt();
        int arr[]= new int[n+1];
        System.out.println("Enter the elements of an array");
        for(i=0 ; i<n;i++){
           arr[i]=sc.nextInt();
        }


        for (i = 0; i < n; i++) {
            j = i + 1;
            
            while ( j < n) {
              if (arr[i] == arr[j]) {
                return true;
            }
              j++;
            }
          }
        return false;
        }
}
