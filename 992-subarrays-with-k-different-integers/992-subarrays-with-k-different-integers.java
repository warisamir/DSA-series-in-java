class Solution {
 public int subarraysWithKDistinct(int[] nums, int k) {
        return Subarray(nums,k) - Subarray(nums,k-1);           
    }
public int Subarray(int[] nums,int k){
   HashMap<Integer,Integer> hm  = new HashMap<>();
  int n=nums.length;
    int i=0,j=0,count=0;
    while(i<n){
        hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        i++;
        while(hm.size()>k){
            hm.put(nums[j],hm.get(nums[j])-1);
            if(hm.get(nums[j])==0){
                hm.remove(nums[j]);
        }
        j++;
        }
     count+=i-j;
}
    return count;
}
}
