class Solution {
    public int minimumRecolors(String blocks, int k) {
        int i=0,j=0,ct=0,min=Integer.MAX_VALUE;
        while(j<blocks.length()){
            if(blocks.charAt(j)=='W')
                ct++;
            if(j-i+1<k)
                j++;
            else if(j-i+1==k){
                min=Math.min(ct,min);
            if(blocks.charAt(i)=='W')
                ct--;
        i++;j++;
            }
        }
        return min;
    }
}