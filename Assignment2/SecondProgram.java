import java.util.Scanner;

public class SecondProgram {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        
        int candyType[]= new int[n];
        System.out.println("Enter the array");
        for(int i=0;i<n;i++){
            candyType[i]=sc.nextInt();
        }

        System.out.println(candyType.length >> 1);
    }
}

