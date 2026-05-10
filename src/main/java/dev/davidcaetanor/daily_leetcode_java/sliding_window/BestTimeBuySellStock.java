package dev.davidcaetanor.daily_leetcode_java.sliding_window;

public class BestTimeBuySellStock {
    public int execute(int[] prices) {
        int lowPrice = Integer.MAX_VALUE;
        int profit = 0;

        for (int price : prices) {
            if (price < lowPrice) {
                lowPrice = price;
            } else if (price - lowPrice > profit) {
                profit = price - lowPrice;
            }
        }
        return profit;
    }
}
