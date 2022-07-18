class Solution {
    public int maxProfit(int[] prices) {
       int prof=0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
            int max=prices[i]-min;
            if(prof<max)
                prof=max;
            if(prices[i]<min)
                min=prices[i];
        }
        return prof;
    }
}