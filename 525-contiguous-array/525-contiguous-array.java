class Solution {
    public int findMaxLength(int[] nums) {
        int s=0,res=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                s+=-1;
            else s+=1;
            
            if(hm.containsKey(s))
                res=Math.max(res,i-hm.get(s));
            else
                hm.put(s,i);
        }
        return res;
    }
}