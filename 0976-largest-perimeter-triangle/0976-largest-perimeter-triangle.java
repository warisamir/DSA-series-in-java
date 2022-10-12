class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for(int i=0; i<nums.length-2; i++){
            int v1 = nums[i],v2 = nums[i+1],v3= nums[i+2];
            if(v1+v2> v3 && v2+v3 >v1 && v1+v3> v2)
                res=v1+v2+v3;
            
        }
        return res;
    }
}