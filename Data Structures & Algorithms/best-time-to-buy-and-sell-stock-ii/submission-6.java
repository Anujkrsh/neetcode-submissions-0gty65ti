class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        int buy=Integer.MAX_VALUE;
        int sell=0;
        for(int i=0;i<prices.length;i++){
            if(buy==Integer.MAX_VALUE && i<prices.length-1 && prices[i]<prices[i+1]){
                buy=prices[i];
            }
            if(buy!=Integer.MAX_VALUE && i<prices.length-1 && prices[i]>prices[i+1]){
                sell=prices[i];
                profit+=sell-buy;
                buy=Integer.MAX_VALUE;
            }
            if(i==prices.length -1 && buy!=Integer.MAX_VALUE){
                sell=prices[i];
                profit+=sell-buy;
                buy=Integer.MAX_VALUE;
            }
            
        }
        return profit;
    }
}