class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[]=new int[2];
        BitSet bs=new BitSet(nums.length+1);
        for(int i:nums){
            if(bs.get(i)){
                arr[0]=i;
            }
            else{
                bs.set(i);
            }
        }
        for(int i=1;i<=nums.length;i++){
            if(!bs.get(i))
            {
                arr[1]=i;
                break;
            }
        }
        return arr;
    }
}