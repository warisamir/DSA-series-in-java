class Solution {
    public boolean increasingTriplet(int[] nums) {
        int num1=Integer.MAX_VALUE;
        int num2=Integer.MAX_VALUE;
        for(int i:nums){
        if(i<num1)
            num1=i;
        else if(num1<i && num2>i)
            num2=i;
          else if(num1<i && num2<i)
              return true;
            }
        return false;
    }
}