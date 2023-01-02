class Solution {
    public int maxRotateFunction(int[] nums) {
        int n=nums.length;
        int sum=0,temp=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            temp+=i*nums[i];
        }
       int res=temp;
            for(int i=0;i<n;i++){
                temp=temp-sum+n *(nums[i]);
                res=Math.max(temp,res);
            }
        return res;
    } 
    }