class Solution {
    int mon[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
    public int countDaysTogether(String aA, String lA, String aB, String lB) {
        for(int i=1;i<13;i++){
            mon[i]+=mon[i-1];
        }
        int ans=0;
        int aliSt=res(aA);
        int aliLt=res(lA);
        int boba=res(aB);
        int bobl=res(lB);
        if(aliLt<boba || bobl<aliSt)
            return ans;
        ans=Math.abs(Math.max(aliSt,boba)-Math.min(aliLt,bobl));
        return ans+1;
    }
    
  
    public int res(String s){
        int mo=Integer.parseInt(s.substring(0,2));
        int d=Integer.parseInt(s.substring(3));
        return mon[mo-1]+d;
    }
}