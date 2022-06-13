class Solution {
    public int[] getAverages(int[] nums, int k) {
       int n=nums.length;
        int arr[]=new int[n];
        int size=2*k+1;
        Arrays.fill(arr,-1);
        if(size>n){
            return arr;
        }
        long sum=0;
        
        for(int i=0;i<size;++i){
            sum+=nums[i];
        }
        for(int i=k;i+k<n;++i){
            arr[i]=(int)(sum/size);
            if(i+k+1<n)
                sum+=nums[i+k+1]-nums[i-k];
        }
        return arr;
    }
}