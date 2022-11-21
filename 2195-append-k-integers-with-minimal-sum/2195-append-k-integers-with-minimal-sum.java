class Solution {
    public long minimalKSum(int[] nums, int k) {
       
        int ct=0;
       long ans=(long)k*(k+1)/2;
        HashSet<Integer>hs=new HashSet<>();
        for(int val:nums){
            if(hs.contains(val)==false && val<=k && val>=1)
            {
                ans=ans-(long)val;
                ct++; 
            }
            hs.add(val);
        }  
       int i=k+1;
        while(ct>0){
        if(hs.contains(i)==false)
        {    ans+=i;
            ct--;
        }i++;
        }
        
    return ans;
}
}