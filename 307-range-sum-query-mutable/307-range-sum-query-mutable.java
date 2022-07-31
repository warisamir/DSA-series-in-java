class NumArray {
    int colgatetotal=0;
List<Integer> l=new ArrayList<>();
    public NumArray(int[] nums) {
        for(int i:nums){
        l.add(i);
            colgatetotal+=i;
        }
    }
    
    public void update(int in, int val) {
      colgatetotal=colgatetotal+(val)-l.get(in);
        l.set(in,val);
    }
    
    public int sumRange(int left, int right) {
        int lsm=colgatetotal;
        for(int i=0;i<left;i++){
            lsm=lsm-l.get(i);
        }
        for(int i=right+1;i<l.size();i++){
            lsm=lsm-l.get(i);
        }
        return lsm;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */