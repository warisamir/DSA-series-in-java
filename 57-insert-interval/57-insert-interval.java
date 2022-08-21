class Solution {
    public int[][] insert(int[][] nums, int[] nm) {
   //   Arrays.sort(nums,(a,b)->a[0]-b[0]);
        ArrayList<int[]> ls=new ArrayList<>();
        int i=0;
        while(i<nums.length && nums[i][1]<nm[0]){
            ls.add(nums[i]);
        i++;
        }
    int []st=nm;
    while(i<nums.length && nums[i][0]<=nm[1])
    {
        st[0]=Math.min(nums[i][0],st[0]);
        st[1]=Math.max(nums[i][1],st[1]);
        i++;
    }
    ls.add(st);
    while(i<nums.length){
        ls.add(nums[i]);
        i++;
    }
    return ls.toArray(new int[ls.size()][2]);
    }
}