class Solution {
    public int longestConsecutive(int[] nums) {
      int n=nums.length;
        Set<Integer>hm=new HashSet<>();
        for(int num:nums)
            hm.add(num);
        int l=0;
        for(int nm:hm){
            if(!hm.contains(nm-1)){
            int lngs=0;
            while(hm.contains(nm+lngs))
                lngs++;
            l=Math.max(l,lngs);
        }}
        return l;
    }
}