class Solution {

    public int maxProfit(int[] prices) {
        
        int BP = Integer.MAX_VALUE; // Best Buying Price
        int Max = 0;                // Maximum Profit
        
        for(int i = 0; i < prices.length; i++){
            
            if(BP < prices[i]){
                int Profit = prices[i] - BP;
                Max = Math.max(Max, Profit);
            } 
            else{
                BP = prices[i];
            }
        }
        
        return Max;
    }
}