class Solution {
    public int maxProfit(int[] prices) {
        int left[]=new int[prices.length];
        int righ[]=new int[prices.length];
        int buy=prices[0];
        for(int i=1;i<prices.length;i++){
            int pro=prices[i]-buy;
            if(left[i-1]>pro)
                pro=left[i-1];
            left[i]=pro;
            buy=Math.min(prices[i],buy);
        }
        int sell=prices[prices.length-1];
        for(int i=prices.length-2;i>=0;i--){
            int p=sell-prices[i];
            if(righ[i+1]>p)
                p=righ[i+1];
            righ[i]=p;
            sell=Math.max(sell,prices[i]);
        }
        int maxpor=0;
        for(int i=0;i<prices.length;i++){
            int curr=left[i]+righ[i];
            if(curr>maxpor)
                maxpor=curr;
        }
        return maxpor;
    }
}