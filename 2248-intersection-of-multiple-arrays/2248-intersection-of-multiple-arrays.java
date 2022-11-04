class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer>ls=new ArrayList<>();
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i[]:nums){
            for(int x:i){
                    hm.put(x,hm.getOrDefault(x,0)+1);
                if(hm.get(x)==nums.length)ls.add(x);
            }
        }
         Collections.sort(ls);
        return ls;
    }
}