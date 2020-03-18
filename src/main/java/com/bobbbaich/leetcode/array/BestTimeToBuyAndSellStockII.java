package com.bobbbaich.leetcode.array;

public class BestTimeToBuyAndSellStockII {

    public int maxProfit(int[] prices) {
        int profit = 0;
        int buyIndex = 0;
        int sellIndex = 1;

        for (int nextPriceIndex = 1; nextPriceIndex < prices.length; nextPriceIndex++) {
            if (prices[nextPriceIndex - 1] >= prices[nextPriceIndex]) {
                // find buyIndex
                buyIndex = nextPriceIndex;
                sellIndex = buyIndex;
            } else if (prices[sellIndex] < prices[nextPriceIndex]) {
                // find sellIndex
                sellIndex = nextPriceIndex;
            }

            // do not sell at the same day or earlier
            // do not sell by less prise
            if (buyIndex < sellIndex && prices[buyIndex] < prices[sellIndex]) {
                profit = profit + (prices[sellIndex] - prices[buyIndex]);
                buyIndex = nextPriceIndex;
            }
        }

        return profit;
    }
}
