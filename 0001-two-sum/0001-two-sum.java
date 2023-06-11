class Solution {
    public int[] twoSum(int[]a, int t){
        Map<Integer,Integer>hm=new HashMap<>();
     for(int i=0;i<a.length;i++){
         int compli=t-a[i];
         if(hm.containsKey(compli))
             return new int[]{hm.get(compli),i};
         hm.put(a[i],i);
     }
        return new int[]{-1,-1};
}
}