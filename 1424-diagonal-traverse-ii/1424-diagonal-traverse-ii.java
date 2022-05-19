class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
     List<Integer> l=new ArrayList<>();
        Map<Integer,List<Integer>>hm=new HashMap<>();
        int maxKey=0;
        for(int i=0;i<nums.size();++i)
            for(int j=0;j<nums.get(i).size();++j){
              final  int key=i+j;
                hm.putIfAbsent(key,new ArrayList<>());
                hm.get(key).add(nums.get(i).get(j));
                 maxKey=Math.max(key,maxKey);
            }
            for(int i=0;i<=maxKey;i++){
                for(int j=hm.get(i).size()-1;j>=0;j--)
                    l.add(hm.get(i).get(j));
            }
        
        return l.stream().mapToInt(i->i).toArray();
    
    }
}
