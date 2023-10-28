class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long answer=0;
        long sum=0;
        HashMap<Integer,Integer>mp=new HashMap<>();
        int release=0;
        int distinct=0; 
        for(int i=0;i<k;i++){
            if(mp.containsKey(nums[i])){
                sum+=nums[i];
                mp.put(nums[i],mp.get(nums[i])+1);
            }else{
                mp.put(nums[i],1);
                distinct++;
                sum+=nums[i];
            }
        }
        if(distinct==k){
            answer=Math.max(answer,sum);
        }
        for(int acquire=k;acquire<nums.length;acquire++){
            
            sum-=nums[release];
            mp.put(nums[release],mp.get(nums[release])-1);
            if(mp.get(nums[release])==0){
                mp.remove(nums[release]);
                distinct--;
            }
            release++;
            
            
            
            if(mp.containsKey(nums[acquire])){
                sum+=nums[acquire];
                mp.put(nums[acquire],mp.get(nums[acquire])+1);
            }else{
                 mp.put(nums[acquire],1);
                distinct++;
                sum+=nums[acquire];
            }
            
            if(distinct==k)answer=Math.max(answer,sum);
            
            
        }
        return answer;
    }
}