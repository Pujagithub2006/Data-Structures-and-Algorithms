package Patterns.SlidingWindow;

// Problem Link - https://leetcode.com/problems/maximum-average-subarray-i/?envType=problem-list-v2&envId=w3bix3ih
// LC 643 - Maximum Average Subarray 1

public class LC643 {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i=0; i<k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        int startIndx = 0;
        int endIndx = k;

        while(endIndx < nums.length) {
            sum -= nums[startIndx];
            startIndx++;

            sum += nums[endIndx];
            endIndx++;

            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum / k;

    }
}
