class Solution {
    public boolean search(int[] nums, int target) {
        int high=nums.length-1;
        int low=0;
        while(low<=high){
          int  mid=(low+high)/2;
            if(nums[mid]==target)
                return true;
        if(nums[mid]<nums[high])//mid to high is sorted
        {
            if(target>=nums[mid] && target<=nums[high])
                low=mid+1;
            else
                high=mid-1;
        }else if(nums[mid]>nums[high])
        {
            if(target>=nums[low] && target<=nums[mid])
                high=mid-1;
            else
                low=mid+1;
        }else
            high--;
            
            }
        return false;
    }
}