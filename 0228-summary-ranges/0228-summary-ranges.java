class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String>ls=new ArrayList<>();
        int st=0;
        for(int i=0;i<nums.length;i++){
            st=nums[i];
            while(i+1<nums.length && nums[i]+1==nums[i+1])
                i++;
            if(st!=nums[i])
                ls.add(""+st+"->"+nums[i]);
                else{
                    ls.add(""+st);
                }
        }
        return ls;
    }
}