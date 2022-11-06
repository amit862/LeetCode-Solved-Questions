class Solution {
    public int maxProfit(int[] prices) { //T.C=> O(n) & S.C => O(1)
        int maxProfit = 0;
        int minSoFar = prices[0];
        
        for(int i=0; i<prices.length; i++){
            minSoFar = Math.min(minSoFar, prices[i]);
            int profit = prices[i] - minSoFar;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}