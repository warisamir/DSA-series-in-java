class CountIntervals {
    CountIntervals left,right;
    int lb,ub,count;
    public CountIntervals() {
         this (1,1_000_000_000);
    }
    public CountIntervals(int lb,int ub){
        this.lb=lb;
        this.ub=ub;
    }
    public void add(int l, int r) {
        if(count==ub-lb+1)
            return ;
        if(l<=lb && ub<=r){
            count=ub-lb+1;
            return;
        }
       int  mid=lb+(ub-lb)/2;
        if(left==null) left=new  CountIntervals(lb,mid);
        if(right==null) right= new CountIntervals(mid+1,ub);
        if(l<=mid) left.add(l,r);
        if(r>mid) right.add(l,r);
        count=left.count+right.count;
    }
    
    public int count() {
        return count;
    }
}

/**
 * Your CountIntervals object will be instantiated and called as such:
 * CountIntervals obj = new CountIntervals();
 * obj.add(left,right);
 * int param_2 = obj.count();
 */