class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int c=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]==0)
               c++;
            break;//count after how many times first time the 1 arrive ;
        }
        for(int i=c+1;i<nums.length;i++){
            if(nums[i]==1){
                //here we are checking if the diffrence of 1and 0 bit decrease or remain the same 
                int d=i-(c+1);
                c=i;
                if(d<k)
                    //if( diffrence between 1 and 0 digit would be less than k times then we return false)
                    return false;
            }
        }
        return true;
    }
}