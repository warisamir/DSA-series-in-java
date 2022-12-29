class Solution {
    public int maxArea(int[] height) {
        int st=0;
        int end=height.length-1;
        int max=0;
     
        while(st<end){
          int  area=Math.min(height[st],height[end])*(end-st);
            max=Math.max(area,max);
            if(height[st]<height[end])
                st++;
            else
                end--;
        }
        return max;
    }
}