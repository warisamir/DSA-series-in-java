class Solution {
    public int maxProfit(int[] prices, int fee) {
        int bsp=-prices[0],ssp=0;
       for(int i=1;i<prices.length;i++){
           int nbsp=0,nssp=0;
           if(ssp-prices[i]>bsp)
               nbsp=ssp-prices[i];
           else
               nbsp=bsp;
           if(bsp+prices[i]-fee>ssp)
               nssp=bsp+prices[i]-fee;
           else
               nssp=ssp;
           bsp=nbsp;
           ssp=nssp;
       }
        
        return ssp;
    }
}