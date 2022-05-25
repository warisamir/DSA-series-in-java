class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer>s=new HashSet<>();
        HashMap <Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
       for(int val:hm.values()){
           if(!s.add(val))
           return false;
       }
        return true;
    }
}