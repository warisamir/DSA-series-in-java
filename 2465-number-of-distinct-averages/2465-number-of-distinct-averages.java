class Solution {
    public int distinctAverages(int[] nums) {
        HashSet<Double>hm=new HashSet<>();
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        while(i<j){
          double sum=(double)(nums[i]+nums[j])/2;
            hm.add(sum);
            i++;j--;
        }
         return hm.size();   
    }
}