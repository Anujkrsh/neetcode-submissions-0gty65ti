class Solution {
    public int maxProfit(int[] prices) {
    int buy=0;
    int max=0;
    for(int i=1;i<prices.length;i++){
        if(prices[i]>prices[buy]){
            int profit=prices[i]-prices[buy];
            max=Math.max(max,profit);
        }else{
            buy=i;
        }
    }

        return max;
    }
    
}
