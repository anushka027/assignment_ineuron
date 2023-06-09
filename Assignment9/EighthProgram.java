import java.util.Scanner;

public class EighthProgram {
    public static long calculateProduct(int[] arr) {
        long product = 1;
        
        for (int num : arr) {
            product *= num;
        }
        
        return product;
    }

    public static void main(String[] args) {
        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculate the product of array elements
        long product = calculateProduct(arr);

        // Print the result
        System.out.println("The product of the array elements is: " + product);
    }
}
