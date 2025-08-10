class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];  // To store the maximum sum found so far
        int currentSum = nums[0]; // To store the current subarray sum

        for (int i = 1; i < nums.length; i++) {     //KEEP IN MIND AS IT START FROM  SECOND POSTION BECAUSE FIRST WE ALREDY FIXED .
            // Either extend the current subarray or start a new one
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // Update maxSoFar if currentSum is greater
            maxSoFar = Math.max(maxSoFar, currentSum);
        }
        return maxSoFar;
    }
}
