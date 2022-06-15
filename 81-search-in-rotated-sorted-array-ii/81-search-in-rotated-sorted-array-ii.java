class Solution {
    public boolean search(int[] nums, int target) {
        int high=nums.length-1;
        int low=0,mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]==target ||nums[low]==target)return true;
            else if(nums[low]<nums[mid]){
                if(nums[low]<=target && nums[mid]>target) high=mid-1;
                else 
                    low=mid+1;
            }
            else if(nums[mid]<nums[high]){
                if(nums[mid]<target && nums[high]>=target) low=mid+1;
            else
                high=mid-1;
        }
            else
                low++;
        }
        return false;
    }
}