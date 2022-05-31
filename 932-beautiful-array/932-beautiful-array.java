class Solution {
    int res[];
    int n,k;
    public int[] beautifulArray(int n) {
        res=new int[n];
        k=0;
       this.n=n;
        result(1,1);
        return res;
    }
    public void result(int st,int inc){
        if(st+inc>n)
        {    
            res[k++]=st;
        return;
    }
        result(st,2*inc);
        result(st+inc,2*inc);
    }
   
}