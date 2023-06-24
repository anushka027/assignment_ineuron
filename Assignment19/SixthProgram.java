public class SixthProgram {
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergedArray = new int[n1 + n2];
        
        int i = 0; // Pointer for arr1
        int j = 0; // Pointer for arr2
        int k = 0; // Pointer for mergedArray
        
        // Compare elements from both arrays and merge them in sorted order
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k] = arr1[i];
                i++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }
        
        // Copy remaining elements from arr1, if any
        while (i < n1) {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }
        
        // Copy remaining elements from arr2, if any
        while (j < n2) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }
        
        return mergedArray;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        
        System.out.println("Array 1:");
        printArray(arr1);
        
        System.out.println("Array 2:");
        printArray(arr2);
        
        int[] mergedArray = mergeSortedArrays(arr1, arr2);
        
        System.out.println("Merged Array:");
        printArray(mergedArray);
    }
    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}