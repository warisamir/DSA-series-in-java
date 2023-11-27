class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n =nums.length;
        int nums2[][]=new int[n][2];
        int res[]=new int[n];
        ArrayList<List<Integer>>ls=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            nums2[i][0]=nums[i];
            nums2[i][1]=i;
        }
        Arrays.sort(nums2,(a,b)->a[0]-b[0]);
        for(int i=0;i<n;i++){
            if(i==0|| nums2[i][0]-nums2[i-1][0]>limit)
                ls.add(new ArrayList<>());
            ls.get(ls.size()-1).add(nums2[i][1]);
        }
        for(List<Integer>l:ls){
            ArrayList<Integer>sorted=new ArrayList<>(l);
        Collections.sort(sorted);
            for(int j=0;j<l.size();j++){
                res[sorted.get(j)]=nums[l.get(j)];
            }
        }
        return res;
        
    }
}