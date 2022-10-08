class TimeMap {
  Map<String,TreeMap<Integer,String>>hm;
    public TimeMap() {
        hm=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        hm.computeIfAbsent(key,x->new TreeMap<>()).put(timestamp,value);
    }
    
    public String get(String key, int timestamp) {
        Integer v=(hm.containsKey(key))?hm.get(key).floorKey(timestamp):null;
        return v!=null?hm.get(key).get(v):"";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */