class Solution {
    public boolean closeStrings(String w1, String w2) {
        if(w1.length()!=w2.length())return false;
        //make a priority queue to add element and remove all one by one to check if any of the element is missing or not
        PriorityQueue<Integer>q1=new PriorityQueue<>();
        PriorityQueue<Integer>q2=new PriorityQueue<>();
        Map<Character,Integer>hm1=new HashMap<>();
        for(char c:w1.toCharArray()){
            hm1.put(c,hm1.getOrDefault(c,0)+1);
        }
         Map<Character,Integer>hm2=new HashMap<>();
        for(char c:w2.toCharArray()){
            if(!hm1.containsKey(c))return false;
            hm2.put(c,hm2.getOrDefault(c,0)+1);
        }
        q1.addAll(hm1.values());
        q2.addAll(hm2.values());
        while(!q1.isEmpty() && !q2.isEmpty()){
            int rem=q1.remove();
            int m=q2.remove();
            if(rem!=m)
                return false;
        }
        return q1.isEmpty() && q2.isEmpty();
    }
}