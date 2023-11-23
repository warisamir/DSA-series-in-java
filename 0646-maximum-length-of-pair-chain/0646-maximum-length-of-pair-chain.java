class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->a[1]-b[1]);
        int prev=0;
        int ct=1,max=0;
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>pairs[prev][1])
            {
             prev=i;ct++;
            }
        }
        return ct;
    }
}