class Solution {
    public List<Integer> grayCode(int n) {
        if(n==1)
        {
        List<Integer>ls=new ArrayList<>();
            ls.add(0);
            ls.add(1);
             return ls;
        }
        List<Integer>ls=grayCode(--n);
        for(int i=ls.size()-1;i>=0;i--){
            int ans=(ls.get(i))|(1<<n);
            ls.add(ans);
        }
        return ls;
    }
}