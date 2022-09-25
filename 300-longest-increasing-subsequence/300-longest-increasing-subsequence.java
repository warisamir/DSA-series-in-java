class Solution {
    public int lengthOfLIS(int[] nums) {
        int lis[]=new int[nums.length];
        lis[0]=nums[0];
        int l=1;
        for(int i=1;i<nums.length;i++){
                if(nums[i]>lis[l-1])
                { l++;
             lis[l-1]=nums[i];
                }
            else{
                int idx=Arrays.binarySearch(lis,0,l-1,nums[i]);
                if(idx<0){
                    idx=-idx;
                    idx=idx-1;
                }
                lis[idx]=nums[i];
            }
            }
     
        return l;
    }
}