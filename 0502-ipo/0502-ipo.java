class Solution {
    public int findMaximizedCapital(int k, int w, int[] pro, int[] cap) {
        int n=pro.length;
         PriorityQueue<Integer> minpq = new PriorityQueue<>(n, (i1, i2) -> cap[i1] - cap[i2]);
    PriorityQueue<Integer> mxpq = new PriorityQueue<>(n, (i1, i2) -> pro[i2] - pro[i1]);
 for(int i=0;i<pro.length;i++)
            minpq.add(i);
        for(int i=0;i<k;i++){
            while(!minpq.isEmpty() && w>=cap[minpq.peek()]){
                mxpq.add(minpq.poll());
            }
            if(mxpq.isEmpty())
                break;
            w+=pro[mxpq.poll()];
        }
        return w;
    }
}