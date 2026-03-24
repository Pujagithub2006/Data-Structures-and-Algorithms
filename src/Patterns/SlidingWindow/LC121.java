package Patterns.SlidingWindow;

// Problem Link - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=problem-list-v2&envId=w3bix3ih
// LC 121 - Best Time to Buy and Sell Stock

public class LC121 {
    public int maxProfit(int[] prices) {
        int minBuy = Integer.MAX_VALUE;
        int maxProfit = 0;

        // for(int i=0; i<prices.length; i++) {
        //     if(prices[i] < minBuy) minBuy = prices[i];

        // if(prices[i] - minBuy > maxProfit) {
        //         maxProfit = prices[i] - minBuy;
        //     }
        // }

        for(int i=0; i<prices.length; i++) {
            minBuy = Math.min(minBuy, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minBuy);
        }


        return maxProfit;

    }
}
