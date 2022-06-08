class Solution {
        public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:nums){
           hm.put(i,hm.getOrDefault(i,0)+1);
        }
            List<Integer>l=new ArrayList<>();
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->hm.get(a)!=hm.get(b)?hm.get(a)-hm.get(b):b-a);
            pq.addAll(hm.keySet());
        while(!pq.isEmpty())
        { int ch=pq.poll();
            int t=hm.get(ch);
            for(int i=0;i<t;i++)
                l.add(ch);
        }
            int arr[]=new int[l.size()];
            for(int i=0;i<l.size();i++){
                arr[i]=l.get(i);
            }
            return arr;
    }
}
