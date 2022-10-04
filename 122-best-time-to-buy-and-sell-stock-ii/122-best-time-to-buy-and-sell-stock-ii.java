class Solution {
    public int maxProfit(int[] prices) {
       int pro=0;
        int bd=0,sd=0;
       for(int i=1;i<prices.length;i++){
           if(prices[i]>=prices[i-1])
               sd++;
           else
           {  pro+=prices[sd]-prices[bd];
           sd=bd=i;}
       }
        pro+=prices[sd]-prices[bd];
        return pro;
    }
}