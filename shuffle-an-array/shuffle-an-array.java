class Solution {
private int nums[];
    public Solution(int[] nums) {
        this.nums=nums;
    }
    
    public int[] reset() {
        return nums;
    }
    
    public int[] shuffle() {
        int n=nums.length;
        int res[]=new int [n];
        res=nums.clone();
        for(int i=0;i<n;i++){
            int rand=(int)(Math.random()*(n-i))+i;
            swap(res,i,rand);
        }
        return res;
    }
    public void swap(int []nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }   
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */