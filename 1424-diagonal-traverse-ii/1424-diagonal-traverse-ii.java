class Solution {
    class Pair{
        int i;int val;int sum;
        public Pair(int i,int val,int sum){
            this.i=i;
            this.val=val;
            this.sum=sum;
        }
    }
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        int size=getsize(nums);
        Pair [] arr=new Pair[size];
        int idx=0;
        for(int i=0;i<nums.size();i++){
            for(int j=0;j<nums.get(i).size();j++){
                Pair tem=new Pair(i,nums.get(i).get(j),i+j);
                arr[idx++]=tem;
            }
        }
        Arrays.sort(arr,(a,b)->{ 
            if(a.sum!=b.sum) return a.sum-b.sum ;
            return b.i-a.i;});
        int ans[]=new int[size];
        int i=0;
        for(Pair p:arr){
            ans[i++]=p.val;
        }
        return ans;
    }
    public int getsize(List<List<Integer>>ls){
        int size=0;
        for(List<Integer>val:ls)
            size+=val.size();
        return size;
    }
}