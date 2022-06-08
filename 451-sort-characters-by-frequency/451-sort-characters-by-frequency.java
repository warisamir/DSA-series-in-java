class Solution {
    public String frequencySort(String s) {
       
        HashMap<Character,Integer>hm=new HashMap<>();
        for(Character i:s.toCharArray()){
            hm.put(i,hm.getOrDefault(i,0)+1);
        
        }
        String s1="";
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->hm.get(b)-hm.get(a));
        pq.addAll(hm.keySet());
        while(!pq.isEmpty()){
            Character ch=pq.poll();
            int t=hm.get(ch);
            for(int i=0;i<t;i++)
                s1+=ch;
        }
        return s1;
    }
}