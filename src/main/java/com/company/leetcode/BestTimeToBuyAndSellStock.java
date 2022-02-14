package com.company.leetcode;

// Todo
public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        maxProfit(prices);
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] - prices[j] > 0) {
                    System.out.println(String.format("Array: %d %d", prices[i] - prices[j], prices[j]));
                }
            }
        }
        return 0;
    }
}
