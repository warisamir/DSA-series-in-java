class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int tem=0,ct=0;
      for(int a:nums){
          if((a&1)==1){
           ct++;
           if(tem<ct)tem=ct;  
          }
          else
              ct=0;
      }
        return tem;
    }

    }
    