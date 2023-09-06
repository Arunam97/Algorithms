/*
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * 
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
public class N0121_BuySellStock
{
    public int maxProfit(int[] prices) 
    {
        int buy = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0 ; i < prices.length ; i++)
        {
            buy = Math.min(buy, prices[i]);
            profit = Math.max(profit, prices[i] - buy); // Profit is only calculated by taking a buy value from a previous index.
        }
        return profit;
    }
}
