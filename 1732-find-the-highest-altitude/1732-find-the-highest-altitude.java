class Solution {
    public int largestAltitude(int[] g) {
      
       int max = 0;
       int curr = 0;
        for(int i=0; i<g.length; i++){
            curr+= g[i];
            max = Math.max(max, curr);
        }
        return max;
    }
}