class Solution {
    public int maxProfit(int[] prices) {
        int ssp=0;
        int csp=0;
        int bsp=-prices[0];
        for(int i=1;i<prices.length;i++){
          int nbsp=Math.max(csp-prices[i],bsp);
            int nssp=Math.max(bsp+prices[i],ssp);
            int ncsp=Math.max(ssp,csp);
            bsp=nbsp;
            ssp=nssp;
            csp=ncsp;
        }
        return ssp;
    }
}