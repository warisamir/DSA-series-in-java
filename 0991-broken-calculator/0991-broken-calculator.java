class Solution {
    public int brokenCalc(int a, int t) {
       if(a>=t)return a-t;
        else {
            if((t^1)==(t+1))
            return 1+ brokenCalc(a,t/2);
            return 1+ brokenCalc(a,t+1);
        }
        
    }
}