class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder uniq=new StringBuilder();
        for(int i=0;i<nums.length;i++){
            uniq.append(nums[i].charAt(i)=='0'?'1':'0');
        }
        return uniq.toString();
    }
}