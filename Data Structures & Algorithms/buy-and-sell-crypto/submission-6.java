class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buy=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<prices.length;i++){
            if(buy>prices[i]){
                buy=prices[i];
            }else{
                max=prices[i]-buy;
                profit=Math.max(profit,max);
            }
            
        }
        return profit;
    }
}
