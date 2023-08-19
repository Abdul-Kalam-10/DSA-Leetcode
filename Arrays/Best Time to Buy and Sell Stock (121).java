class Solution {
    public int maxProfit(int[] prices) {
        int buyprice = prices[0]; //
        int profit=0;       //initially the profit is zero
        for(int i=1;i<prices.length;i++){  //start from 1 to end..
            if(prices[i]  < buyprice){ //check price < buyprice
                buyprice = prices[i];  //lower price set as buprice
            }
            else{
                int current_profit = prices[i] - buyprice;//profit = sell-buy
                profit = Math.max(current_profit,profit); //max value 
            }
        } 
        return profit;  //return the profit value 
    }
}