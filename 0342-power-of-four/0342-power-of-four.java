class Solution {
    public boolean isPowerOfFour(int n) {
      int setb=0;
        for(int bt=0;bt<32;bt++){
            if((n&(1<<bt))!=0)
            {
                setb++;
                if((bt&1)==1)
                    return false;
            }
        }
        return (setb==1);
    }
}