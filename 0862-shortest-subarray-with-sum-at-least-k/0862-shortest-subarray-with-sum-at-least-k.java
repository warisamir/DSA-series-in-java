class Solution {
    public int shortestSubarray(int[] A, int K) {
    long [] arr = new long [A.length+1];
		//prefix sum
        for(int i=0;i<A.length;i++){
            arr[i+1] = arr[i]+A[i];
            if(A[i]>=K) return 1;
        }
        int res=Integer.MAX_VALUE;
        Deque<Integer> queue = new ArrayDeque<>();
        for(int i=0;i<arr.length;i++){
            while(!queue.isEmpty()&&arr[i]<=arr[queue.getLast()])   
                queue.removeLast();
            while(!queue.isEmpty()&&arr[i]-arr[queue.peek()]>=K)  
                res = Math.min(res,i-queue.poll());
            queue.add(i);
        }
            return res==Integer.MAX_VALUE?-1:res;
        //  int n=nums.length;
       //  int sum=0,minl=n+1,st=0,end=0;
       // while(end<n){
       //     while(sum<=k && end<n){
       //         sum+=nums[end++];
       //     }
       //     while(sum>k &&  st<n){
       //         if(end-st< minl)
       //             minl=end-st;
       //         sum-=nums[st++]; 
       //     }
       // }
       //          return minl;
    }
}