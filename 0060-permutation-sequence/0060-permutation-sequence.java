class Solution {
    public String getPermutation(int n, int k) {
        List<Integer>ls=new ArrayList<>();
        int fac=1;
        for(int i=1;i<n;i++){
            fac=fac*i;
            ls.add(i);
        }
        ls.add(n);
        String ans="";
        k=k-1;
        while(true){
            ans=ans+ls.get(k/fac);
            ls.remove(k/fac);
            if(ls.size()==0)
                break;
            k=k%fac;
            fac=fac/ls.size();
        }
        return ans;
    }
}