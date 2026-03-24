package Patterns.Kadanes.StandardDirectImpl;

// Problem Link - https://leetcode.com/problems/maximum-subarray/description/?envType=problem-list-v2&envId=w3bcqrvs
// LC53 - Maximum Subarray

public class LC53 {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for(int i = 1; i<nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;

    }


}
