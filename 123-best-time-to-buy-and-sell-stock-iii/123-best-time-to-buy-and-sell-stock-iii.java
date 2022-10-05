class Solution {
    public int maxProfit(int[] prices) {
       int dp[]=new int[prices.length];
        //dpstarting  = profit if sold today or before today
        dp[0]=0;
        int lpsf=prices[0];
        for(int i=1;i<prices.length;i++){
            lpsf=Math.min(lpsf,prices[i]);
            int pist=prices[i]-lpsf;
            dp[i]=Math.max(dp[i-1],pist);
        }
        //dpbaad  = store profit if bought today or after today 
        int dpb[]=new int[prices.length];
        dpb[dpb.length-1]=0;
        int mpsf=prices[prices.length-1];
        for(int i=prices.length-2;i>=0;i--){
          mpsf=Math.max(mpsf,prices[i]);
            int prof=mpsf-prices[i];
            dpb[i]=Math.max(dpb[i+1],prof);
        }
        //dp+dpb= 
        int val=0;
        for(int i=0;i<prices.length;i++){
            val=Math.max(dp[i]+dpb[i],val);
        }
        return val;
    }
}