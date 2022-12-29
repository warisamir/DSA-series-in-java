class Solution {
    public int[] getOrder(int[][] task) {
       int neworder[][] =new int[task.length][3];
        for(int i=0;i<task.length;i++){
            neworder[i][0]=task[i][0];
             neworder[i][1]=task[i][1];
             neworder[i][2]=i;
        }
        Arrays.sort(neworder,Comparator.comparingInt(a->a[0]));
        PriorityQueue<int []>pq=new PriorityQueue<>((a,b)->(a[0]!=b[0])?(a[0]-b[0]): (a[1] - b[1]));
        int[] ans = new int[task.length];
        int ansIndex = 0, currTime = 0;
        for (int i = 0; i < neworder.length; i++) {
            while (currTime < neworder[i][0] && !pq.isEmpty()) {
                int[] topTask = pq.remove();
                ans[ansIndex++] = topTask[1];
                currTime += topTask[0];
            }
            currTime = Math.max(currTime, neworder[i][0]);
            pq.add(new int[]{neworder[i][1], neworder[i][2]});
        }
        while (!pq.isEmpty()) {
            int[] topTask = pq.remove();
            ans[ansIndex++] = topTask[1];
        }

        return ans;
    }
}