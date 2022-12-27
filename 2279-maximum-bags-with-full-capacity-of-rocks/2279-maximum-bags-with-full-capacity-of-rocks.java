class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        // int n[]=new int[capacity.length];
        for(int i=0;i<capacity.length;i++)
        {
            capacity[i]=capacity[i]-rocks[i];
        }
        int ct=0;
        Arrays.sort(capacity);
        for(int i=0;i<capacity.length;i++){
           if(additionalRocks>=capacity[i])
           { additionalRocks-=capacity[i];
            ct++;
           }
            }
        return ct;
    }
}