class Solution {
    public int carFleet(int target, int[] po,int sp[]) {
       TreeMap<Integer,Integer>hm=new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<po.length;i++){
            hm.put(po[i],sp[i]);
        }
        
        double t=0;
        int c=0;
        for(Map.Entry<Integer,Integer>hm2:hm.entrySet()){
            int a=hm2.getKey();
            int b=hm2.getValue();
            int dist=target-a;
            double time=dist*1.0/b;
            if(time>t){
                t=time;
                c++;
            }
            
        }
        return c;
    }
}