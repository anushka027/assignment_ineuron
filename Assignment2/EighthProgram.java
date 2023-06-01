import java.util.Scanner;

public class EighthProgram {
    public static int minScore(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int minScore = max - min; 

        for (int num : nums) {
            int subtractScore = Math.abs(max - (num - k));
            int addScore = Math.abs((num + k) - min);
            int score = Math.min(minScore, Math.max(subtractScore, addScore));
            minScore = Math.min(minScore, score);
        }

       
        return minScore;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array it should be more than 3");
        int k = sc.nextInt();

        int nums[]= new int[100];
        System.out.println("Enter the array");
        for(int i=0;i<k;i++){
            nums[i]=sc.nextInt();
        }
        int minScore = minScore(nums, k);
        System.out.println("Minimum score of nums: " + minScore);
    }
}
