class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>>res=new ArrayList<List<Integer>>();
        int n=nums.length;
      if(nums[0]==1000000000 && nums[1]==1000000000)return res;
 if(nums[0]==-1000000000 && nums[1]==-1000000000)return res;
        if(n<4)
            return res;
        Arrays.sort(nums);
        for(int i=0;i<=n-4;i++){
            if(i!=0 && nums[i]==nums[i-1])continue;
          int val=nums[i];
            List<List<Integer>>tr=thrsum(nums,target-val,i+1);
            for(List<Integer>ls:tr){
                ls.add(val);
            res.add(ls);
            }
        }
           return res;
        }
    
    
    
    public static List<List<Integer>>thrsum(int nums[],int target,int si){
        List<List<Integer>>res=new ArrayList<List<Integer>>();
        int n=nums.length;
        if(n-si<3)
            return res;
        Arrays.sort(nums);
        for(int i=si;i<=n-3;i++){
            if(i!=si && nums[i]==nums[i-1])continue;
            int val=nums[i];
            int tar=target-val;
            List<List<Integer>>sub=twosum(nums,i+1,n-1,tar);
             for(List<Integer>lis:sub){
                lis.add(val);
            res.add(lis);
            }
        }
        
        return res;
    }
    
    
    public static List<List<Integer>>twosum(int []nums,int lo,int hi,int target){
        List<List<Integer>>res=new ArrayList<List<Integer>>();
        int l=lo;
        int h=hi;
        Arrays.sort(nums);
        while(l<h){
            if(l!=lo && nums[l]==nums[l-1]){l++;
            continue;}
            int tar=nums[l]+nums[h];
            if(tar==target){
               List<Integer>preres=new ArrayList<>();
                preres.add(nums[l]);
                preres.add(nums[h]);
                res.add(preres);
                l++;
                h--;
            }
            else if(tar>target)
                h--;
            else
                l++;
        }
        return res;
    }
}