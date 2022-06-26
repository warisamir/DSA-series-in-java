class Solution {
    public int maxScore(int[] card, int k) {
         int l=0,r=card.length-k;
        int sum=0,res;
        for(int i=r;i<card.length;i++)
            sum+=card[i];
        res=sum;
        while(r<card.length){
            sum+=card[l]-card[r];
            res=Math.max(sum,res);
            l++;r++;
        }
        return res;
    }
}