class Solution {
    public boolean canCross(int[] arr) {
             HashMap<Integer,HashSet<Integer>>hm=new HashMap<>();
         for(int val:arr){
             hm.put(val,new HashSet<>());
         }
        hm.get(0).add(1);
        for(int i=0;i<arr.length;i++){
            int currst=arr[i];
            for(int jmp:hm.get(currst)){
                int pos=jmp+currst;
                if(pos==arr[arr.length-1])
                    return true;
                else if(hm.containsKey(pos)==true)
                {
                    HashSet<Integer>hs=hm.get(pos);
                    if(jmp-1>0)
                        hs.add(jmp-1);
                    hs.add(jmp);
                    hs.add(jmp+1);
                }
                
            }
        }
        return false;
    }
}