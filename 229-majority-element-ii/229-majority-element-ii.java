class Solution {
    public List<Integer> majorityElement(int[] nums) {
       int cn=0,cn2=0;
        int ct1=0,ct2=0;
        for(int val:nums){
            if(val==cn)
            {  
                ct1++;
            }else if(val==cn2){
                ct2++;
            }
            else if(ct1==0){
                ct1=1;
              cn=val;
        }else if(ct2==0){
                ct2=1;
            cn2=val;
        }
            else{
                ct1--;ct2--;
            }}
        
        ct1=0;ct2=0;
        for(int val:nums){
            if(val==cn)
                ct1++;
            else if(val==cn2)
                ct2++;
        }
        ArrayList<Integer>ls=new ArrayList<>();
        if(ct1>nums.length/3)
            ls.add(cn);
        if(ct2>nums.length/3)
            ls.add(cn2);
        
        return ls;
    }
    }
 