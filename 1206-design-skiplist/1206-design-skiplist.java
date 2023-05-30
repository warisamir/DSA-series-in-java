class Skiplist {
 List<Integer>ls;
    public Skiplist() {
        ls=new ArrayList<>();
    }
    
    public boolean search(int target) {
        for(int i=0;i<ls.size();i++){
            if(ls.get(i)==target)
                return true;
        }
        return false;
    }
    
    public void add(int num) {
     ls.add(num);
    }
    
    public boolean erase(int num) {
        for(int i=0;i<ls.size();i++){
            if(ls.get(i)==num){
                ls.remove(ls.get(i));
                return true;}
        }
        return false;
    }
}

/**
 * Your Skiplist object will be instantiated and called as such:
 * Skiplist obj = new Skiplist();
 * boolean param_1 = obj.search(target);
 * obj.add(num);
 * boolean param_3 = obj.erase(num);
 */