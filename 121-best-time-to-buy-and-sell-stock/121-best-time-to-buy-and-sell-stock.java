class Solution {
    public int maxProfit(int[] prices) {
    int pro=0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
           min=Math.min(prices[i],min);
           int pis=prices[i]-min;
            pro=Math.max(pis,pro);
        }
        return pro;
    }
}