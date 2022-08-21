class Solution {
    public int[][] merge(int[][] nums) {
        Arrays.sort(nums,(a,b)->a[0]-b[0]);
        ArrayList<int []>ls=new ArrayList<>();
        for(int []num:nums){
            if(ls.size()==0)
                ls.add(num);
            else{
                int las[]=ls.get(ls.size()-1);
               if(num[0]>las[1])
                  ls.add(num);
                else{
                   las[1]=Math.max(las[1],num[1]); 
                }
            }
        }
        return ls.toArray(new int[ls.size()][2]);
    }
}