import java.util.Scanner;

public class FourthProgram {
    public static void main(String args[]) {
        int i;
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of flowers to be inserted");
        int flowers = sc.nextInt();

        System.out.println("Enter the length of the array");
        int n = sc.nextInt();

        int flowerbed[]= new int[n];
        System.out.println("Enter the array");
        for(i=0;i<n;i++){
            flowerbed[i]=sc.nextInt();
        }

        for(i=0;i<n;i++){
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0)
            && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                count++;
            }
        }
        if (count >= flowers) {
            System.out.println("true");
        }
        else
        System.out.println("false");
    }
}
