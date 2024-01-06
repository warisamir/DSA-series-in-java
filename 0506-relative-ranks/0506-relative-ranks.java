class Solution {
    public String[] findRelativeRanks(int[] score) {
        int l = score.length;
        int[] sc = Arrays.copyOf(score,l);
        Arrays.sort(score);
        String[] ans = new String[l];
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                if(sc[i] == score[j]){
                    int k = l-j;
                    String t = String.valueOf(k);
                    if(k==1) 
                        t = "Gold Medal";
                    if(k==2)
                        t = "Silver Medal";
                    if(k==3)
                        t = "Bronze Medal";
                    ans[i] = t;
                }
            }
        }
        return ans;
    }
}