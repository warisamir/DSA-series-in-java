class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=cost.length;
        int s=0,cs=0,si=0;
        for(int i=0;i<n;i++){
               s+=(gas[i]-cost[i]);
            cs+=(gas[i]-cost[i]);
            if(cs<0){
                cs=0;
                si=i+1;
            }
        }
        if(s<0)return -1;
       else{
          return si;
       }
        
    }
}