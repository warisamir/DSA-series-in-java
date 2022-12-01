class Solution {
    public int bestClosingTime(String s) {
        int ans=0;
        int max=0;
        int profit=0;
        for(int i=0;i<s.length();i++){
            profit+=(s.charAt(i)=='Y')?1:-1;
            if(max<profit)
            {     max=profit;
            ans=i+1;
            }
        }
        return ans;
    }
}