class Solution {
    public int maximumUnits(int[][] box, int truck) {
        Arrays.sort(box,(a,b)-> b[1]-a[1]);
        int ans=0;
        for(int []b:box){
            int min=Math.min(b[0],truck);
             ans+=b[1]*min;
                truck=truck-min;
            if(truck==0)return ans;
        }
        return ans;
    }
}