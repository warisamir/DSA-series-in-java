class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n=nums.length,max=0;
        if(n==0)return new ArrayList<>();
        Arrays.sort(nums);
        ArrayList<Integer>ls=new ArrayList<>();
        int curr[]=new int[n];
        int pre[]=new int[n];
        Arrays.fill(pre,-1);
        for(int i=0;nums[i]<=nums[n-1]/2;++i){
            for(int j=i+1,f=2;nums[i]<=nums[n-1]/f;f=(nums[j]+nums[i]-1)/nums[i]){
                int id=Arrays.binarySearch(nums,j,n,f*nums[i]);
                if(id>0 && curr[id]<=curr[i]){
                    pre[id]=i;
                    curr[id]=curr[i]+1;
                if(curr[id]>curr[max])
                    max=id;
                }
                j=id>=0?id+1:-(id+1);
                if(j>=n)break;
            }
        }
         for (int i = max; i >= 0; i = pre[i]) ls.add(0, nums[i]);
        return ls;
        
    }
}