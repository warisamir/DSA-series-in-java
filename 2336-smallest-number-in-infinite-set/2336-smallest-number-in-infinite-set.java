class SmallestInfiniteSet {
 Set<Integer>hm;
    int small;
    public SmallestInfiniteSet() {
        this.hm=new HashSet<>();
        this.small=1;
    }
    public int popSmallest() {
       hm.add(small);
        int temp=small;
        int x=small;
        while(true){
            if(hm.contains(x))
            x++;
                else{
            small=x;
                    break;
                }
        }
        return temp;
    }
    
    public void addBack(int num) {
        if(num<small)
            small=num;
        if(hm.contains(num))
            hm.remove(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */