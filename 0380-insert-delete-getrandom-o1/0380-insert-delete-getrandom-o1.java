class RandomizedSet {
    Set<Integer>hs;
    public RandomizedSet() {
        hs=new HashSet<>();
    }
    
    public boolean insert(int val) {
           if(!hs.contains(val)){
               hs.add(val);
            return true;
        }
    
        return false;
    }
    
    public boolean remove(int val) {
        if(hs.contains(val)){
            hs.remove(val);
            return true;
        }
         return false;
    }
    
    public int getRandom() {
        List<Integer>ls=new ArrayList<>(hs);
        int r=(int)(Math.random()*hs.size());
        return ls.get(r);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */