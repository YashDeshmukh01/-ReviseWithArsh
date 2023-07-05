package com.yash.Day3;

public class BestTimeBuySellStockII {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {
        int res = 0;
        for(int i = 1; i<prices.length; i++){
            if(prices[i]>prices[i-1]){
                int diff = prices[i]-prices[i-1];
                res+=diff;
            }
        }
        return res;
    }
}
