class Solution {
     List<List<Integer>>ls=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
       ls=new ArrayList<>();
        ArrayList<Integer>res=new ArrayList<>();
    int vis[]=new int[nums.length];
        int n=nums.length;
        dfs(vis,nums,res);
       return ls;
    }
   public void dfs(int []vis,int nums[],ArrayList<Integer>res){
      if(nums.length==res.size()) 
          ls.add(new ArrayList(res));
       for(int i=0;i<nums.length;i++)
       {
           if(vis[i]==1)
               continue;
       vis[i]=1;
       res.add(nums[i]);
       dfs(vis,nums,res);
       res.remove(res.size()-1);
       vis[i]=0;
       }
   }
}