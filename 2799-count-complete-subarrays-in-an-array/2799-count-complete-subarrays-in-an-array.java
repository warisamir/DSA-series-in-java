class Solution {
   //   بِسمِ اللہِ الرَّحِنِ الرَّحِيم 
    public int countCompleteSubarrays(int[] nums) {
       Set<Integer>hs=new HashSet<>();
        for(int i:nums)
            hs.add(i);
        int distinctnum=hs.size();
        int ct=0;
        for(int i=0;i<nums.length;i++){
            Set<Integer>hs1=new HashSet<>();
            for(int j=i;j<nums.length;j++){
                hs1.add(nums[j]);
                if(hs1.size()==distinctnum)
                    ct++;
                if(hs1.size()>distinctnum)break;
            }
        }
        return ct;
    }
}