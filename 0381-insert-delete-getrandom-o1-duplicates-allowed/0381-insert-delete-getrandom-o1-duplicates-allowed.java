class RandomizedCollection {
    List<Integer> list;
Random random;

public RandomizedCollection() {
    list=new ArrayList<>();
    random=new Random();
}
    
   public boolean insert(int val) 
{
    if(list.contains(val)==false)
    {
        list.add(val);
        return true;
    }
    list.add(val);
    return false;
    
}

public boolean remove(int val) 
{
    if(list.contains(val)==true)
    {
        list.remove(new Integer(val));
        return true;
    }
    return false;
}

public int getRandom()
{
    if(list.size()==0)
    {
        return 1;
    }
    
    int ind=random.nextInt(list.size());
    return list.get(ind);
    
}
}
/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */