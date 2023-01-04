class Solution {
    public int minimumRounds(int[] tasks) {
       HashMap<Integer,Integer>hm=new HashMap<>();
        for(int k:tasks){
            hm.put(k,hm.getOrDefault(k,0)+1);
        }int ct=0;
        for(int k:hm.values()){
            if(k==1)
                return -1;
            else if(k==2)
                ct+=1;
            else
            {
                double s=k/3.0;
                ct+=Math.ceil(s);
            }
        }return ct;
    }
}