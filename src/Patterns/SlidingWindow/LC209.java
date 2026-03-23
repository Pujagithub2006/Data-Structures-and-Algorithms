package Patterns.SlidingWindow;

// Problem Link - https://leetcode.com/problems/minimum-size-subarray-sum/?envType=problem-list-v2&envId=w3bix3ih
// LC 209 - Minimum Size Subarray Sum

public class LC209 {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for(int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while(sum >= target) {
                min = Integer.min(min, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
