class Solution {
    public String largestNumber(int[] nums) {
        StringBuilder res=new StringBuilder();
         Queue<Integer> pq = new PriorityQueue<>(
            (a,b)->{
                String A = String.valueOf(a);String B = String.valueOf(b);
                String s1 = A + B;
			    String s2 = B + A;
			    return s2.compareTo(s1);

                }
        );
            for(int i:nums) pq.offer(i);
        
        while(pq.size()!=0){
            res.append(String.valueOf(pq.poll()));
        }
        
        while(res.length()>1 && res.charAt(0)=='0') res.deleteCharAt(0);
        return res.toString();
    }
}