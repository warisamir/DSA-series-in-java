class Solution {
    class Pair{
        int type;
        int val;
        Pair(int val,int type){
            this.type=type;
            this.val=val;
        }
        public String toString(){
            return this.val+" "+this.type;
        }
    }
    public int largestValsFromLabels(int[] values, int[] labels, int numw, int useLimit) {
        int res=0;
        PriorityQueue<Pair>pq=new PriorityQueue<Pair>((a,b)->b.val-a.val);
        for(int i=0;i<values.length;i++){
        pq.add(new Pair(values[i],labels[i]));
            }
        Map<Integer,Integer>hm=new HashMap<>();
        int i=0;
        while(i<numw && !pq.isEmpty()){
            Pair p=pq.poll();
            if(hm.get(p.type)==null)
            {
                res+=p.val;
                hm.put(p.type,1);
               i++;
            }
            else if(hm.get(p.type)!=null && hm.get(p.type)<useLimit){
                res+=p.val;
                hm.put(p.type,hm.get(p.type)+1);
                i++;
            }
            
        }
        return res;
    }
}