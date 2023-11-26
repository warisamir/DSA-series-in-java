class Solution {
    public int longestWPI(int[] hours) {
        if(hours.length==0)
            return 0;
        int sm=0,max=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<hours.length;i++){
            if(hours[i]>8)
                sm++;
            else 
                sm--;
            if(!hm.containsKey(sm))
                hm.put(sm,i);
            if(sm>0)
                max=i+1;
            else if(hm.containsKey(sm-1))
                max=Math.max(max,i-hm.get(sm-1));
        }
        return max;
    }
}