package Patterns.Kadanes.StateBased;

// Problem Link - https://leetcode.com/problems/maximum-product-subarray/description/
// LC 152 - Maximum Product Subarray

public class LC152 {

    public int maxProduct(int[] nums) {
        int currentMax = nums[0];
        int currentMin = nums[0];
        int prevMax = nums[0];
        int maxProd = nums[0];

        for(int i=1; i<nums.length; i++) {
            prevMax = currentMax;

            currentMax=Math.max(nums[i], Math.max(nums[i]*currentMax, nums[i]*currentMin));

            currentMin=Math.min(nums[i], Math.min(nums[i]*prevMax, nums[i]*currentMin));

            maxProd= Math.max(currentMax, maxProd);

        }

        return maxProd;

    }

}
