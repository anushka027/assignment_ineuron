public class FifthProgram {
    public static void rearrangeArray(int[] arr) {
        int n = arr.length;
        int positiveIndex = 0;
        int negativeIndex = 0;

        // Find the index of the first positive and negative numbers
        while (positiveIndex < n && arr[positiveIndex] < 0) {
            positiveIndex++;
        }
        negativeIndex = positiveIndex;

        // Rearrange the array by alternating positive and negative numbers
        while (positiveIndex < n && negativeIndex < n) {
            // Find the next positive number and swap it with the negative number
            while (positiveIndex < n && arr[positiveIndex] < 0) {
                positiveIndex++;
            }
            if (positiveIndex < n) {
                swap(arr, positiveIndex, negativeIndex);
                negativeIndex++;
            }

            // Find the next negative number and swap it with the positive number
            while (negativeIndex < n && arr[negativeIndex] >= 0) {
                negativeIndex++;
            }
            if (negativeIndex < n) {
                swap(arr, positiveIndex, negativeIndex);
                positiveIndex++;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        
        System.out.println("Original Array:");
        printArray(arr);
        
        rearrangeArray(arr);
        
        System.out.println("Array after rearrangement:");
        printArray(arr);
    }
    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
