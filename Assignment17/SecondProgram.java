public class SecondProgram {
    public static int maxSubarraySumCircular(int[] nums) {
    int totalSum = 0; 
    int maxSum = Integer.MIN_VALUE; 
    int minSum = Integer.MAX_VALUE; 
    int currMax = 0; 
    int currMin = 0; 
    
    for (int i = 0; i < nums.length; i++) {
        totalSum += nums[i];
        currMax = Math.max(currMax + nums[i], nums[i]);
        maxSum = Math.max(maxSum, currMax);
        currMin = Math.min(currMin + nums[i], nums[i]);
        minSum = Math.min(minSum, currMin);
    }
    
    if (maxSum < 0) {
        return maxSum;
    }
    
    int circularMaxSum = totalSum - minSum;
    
    return Math.max(maxSum, circularMaxSum);
}

}
