class Solution {
    long MOD=1000000007L;
    public int sumSubseqWidths(int[] nums) {
      int n=nums.length;
        
        Arrays.sort(nums);
       long sum=0;
        int j=n-1;
        long p=1;
        for(int i=0;i<n;i++){
            sum=(sum+p*nums[i]-nums[j]*p)%MOD;
            p=(p*2)%MOD;
            j--;
        }
        return (int)sum;
    }
}