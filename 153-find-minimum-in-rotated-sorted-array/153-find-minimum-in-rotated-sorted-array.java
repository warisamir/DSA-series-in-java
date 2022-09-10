class Solution {
    public int findMin(int[] nums) {
        int low=0,hi=nums.length-1;
       while(low<hi){
           int mid=(low+hi)/2;
           //left half -> low=> mid
           //right half ->  mid+1=> hi
           if( nums[hi]>nums[mid])
               //growth is in right side,go to left 
               hi=mid;
               else if(nums[hi]<nums[mid])
                   //growth is in left side,go to right
                   low=mid+1;
           else
               hi--;
       } 
        return nums[low];
    }
}