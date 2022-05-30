class Solution {
    public int[] singleNumber(int[] nums) {
    
         if(nums.length ==2)
            return nums;
         int arr[]=new int [2];
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
    }
int ms=xor& -xor ;
        int xor0=0,xor1=0;
        for(int i:nums)
        {
            if((ms&i)!=0)
                xor1^=i;
            else
                xor0^=i;
        }
        arr[0]=xor0;
        arr[1]=xor1;
        return arr;
    }
    
}