class Solution {
    public int maxProfit(int[] prices) {
        // int mini = prices[0];
        // int profit = 0;
        // for(int i = 1;i<prices.length;i++){
        //     int cost = prices[i]-mini;
        //     profit = Math.max(cost,profit);
        //     mini = Math.min(prices[i],mini);
        // }
        // return profit;

    int n = prices.length;
    int profit = 0;
    int min = prices[0];

    for(int i =1; i<n; i++){
        if(prices[i]<min){
            min = prices[i];
        }
        profit = Math.max(prices[i]-min,profit);
    }
    return profit;
    }
}