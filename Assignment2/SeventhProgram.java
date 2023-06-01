import java.util.Scanner;

public class SeventhProgram {
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
        boolean increasing = true;
        boolean decreasing = true;

        for (i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                increasing = false;
            }
            if (arr[i] > arr[i - 1]) {
                decreasing = false;
            }
        }
        System.out.println(increasing||decreasing);
}
}
