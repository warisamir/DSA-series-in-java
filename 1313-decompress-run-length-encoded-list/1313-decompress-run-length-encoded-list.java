class Solution {
    public int[] decompressRLElist(int[] nums) {
       
   
      ArrayList<Integer>ls=new ArrayList<>();
        for(int i=0;i<nums.length;i+=2)
        {
            int fre=nums[i];
            int value=nums[i+1];
            
            while(fre-->0){
            ls.add(value);
            }
        }
        int ab[]=new int[ls.size()];
        for(int i=0;i<ls.size();i++)
        ab[i]=ls.get(i);
  return ab;
    }
}