class Solution {
    public boolean isPossible(int[] target) {
        long s=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i:target){
            s+=i;
            pq.offer(i);
        }
        
        while(pq.peek()!=1){
            int value=pq.poll();
            long diff=s-value;
            if(diff==1)
                return true;
            
            if(diff>value || diff==0 || value%diff==0)
                return false;
            
            value%=diff;
            s=diff+value;
            pq.offer(value);
}return true;
    }
       
    }