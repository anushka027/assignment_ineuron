public class ThirdProgram {
    public static int firstBadVersion(int n) {
        int left = 1;     // Start of the search range
        int right = n;    // End of the search range

        while (left < right) {
            int mid = left + (right - left) / 2;   // Calculate the middle version

            if (isBadVersion(mid)) {
                // If the middle version is bad, search in the left half
                right = mid;
            } else {
                // If the middle version is good, search in the right half
                left = mid + 1;
            }
        }

        return left;   // Return the first bad version
    }

    // Mock implementation of the API isBadVersion(int version)
    private static boolean isBadVersion(int version) {
        // Your implementation here
        // This is a mock implementation for demonstration purposes
        // Replace it with your actual implementation to check the version's validity
        return version >= 4;
    }

    public static void main(String[] args) {
        int n = 10;   // Total number of versions
        int firstBad = firstBadVersion(n);

        System.out.println("The first bad version is: " + firstBad);
    }
}