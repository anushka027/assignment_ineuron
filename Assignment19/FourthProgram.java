public class FourthProgram {
    public static void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int count = 0; // count of non-zero elements

        // Traverse the array
        for (int i = 0; i < n; i++) {
            // If the current element is non-zero, move it to the front of the array
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        // Fill the remaining positions with zeros
        while (count < n) {
            arr[count] = 0;
            count++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};

        System.out.println("Original Array:");
        printArray(arr);

        pushZerosToEnd(arr);

        System.out.println("Array after pushing zeros to the end:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}