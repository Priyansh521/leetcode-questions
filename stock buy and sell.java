class Solution {
    public int maxProfit(int[] prices) {
        int lowest = Integer.MAX_VALUE;
        int sellDayProfit= 0;
        int max = 0;
        for(int i = 0; i<prices.length; i++){
            if(prices[i]< lowest){
                    lowest = prices[i];
             }
             sellDayProfit = prices[i] - lowest;
             if(max< sellDayProfit){
                 max = sellDayProfit;
             }
        }
        return max;
    }
}
