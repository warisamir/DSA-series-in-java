class Solution {
    public int minStoneSum(int[] arr, int k) {
        int n=arr.length;
        PriorityQueue<Integer>pq=new PriorityQueue<Integer>((a,b)->b-a);
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        while(k-->0){
            int rm=pq.poll();
            if(rm%2==0)
                rm=rm/2;
            else
                rm=rm/2+1;
            pq.add(rm);
        }
        int s=0;
        while(!pq.isEmpty()){
            s+=pq.poll();
        }
        return s;
    }
}