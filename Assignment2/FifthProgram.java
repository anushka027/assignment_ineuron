import java.util.Scanner;

public class FifthProgram {
    public static void main(String args[]) {

        int i , pro=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array it should be more than 3");
        int n = sc.nextInt();

        int arr[]= new int[100];
        System.out.println("Enter the array");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        

        for(i=0;i<3;i++){
            int max =arr[0] ;
            int max_index = 0;

            for(int j=0;j<n;j++){
                if(max<arr[j]){
                max= arr[j];
                max_index=j;
                }
                else 
                continue;
            }
            pro*=max ;
            arr[max_index]=0;
        }
        System.out.println("The product is = "+pro);
    }
}
