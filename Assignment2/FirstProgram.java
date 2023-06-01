import java.util.Scanner;

public class FirstProgram {
    public static void MinMax(int ar[],int n) {
        int fp,lp , sum=0 ; 
        for(int i=0 ; i<n; i++){
            fp=i;
            lp=i+1;
            for(int j=0 ; j<n; j++){
            int fp_min = Math.min(ar[fp],ar[fp+1]);
            int lp_min = Math.min(ar[lp],ar[lp+1]);
            if((fp_min+lp_min)>= sum){
                if(fp_min==lp_min)
                continue;
                else
               sum = fp_min+lp_min;
            } 
            else
            continue;
            fp++;
            lp++;
        }
    }
        System.out.println(sum);
    }
    public static void main(String agrs[]) {
        int i;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();

        int arr[]= new int[100];
        System.out.println("Enter the array");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        MinMax(arr,n);

    }
}
