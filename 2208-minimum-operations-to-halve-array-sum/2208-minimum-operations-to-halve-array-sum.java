class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double>pq=new PriorityQueue<Double>(Collections.reverseOrder());
        double sum=0;
        for(double val:nums){
            sum+=val;
            pq.add(val);
        }
        int ct=0;
        double curr=sum;
        while(!pq.isEmpty()){
            ct++;
            double x=pq.poll();
            double h=x/2.0;
            pq.add(h);
            curr=curr-h;
            if(curr<=sum/2.0)
                return ct;
        }
        return ct;
    }
}