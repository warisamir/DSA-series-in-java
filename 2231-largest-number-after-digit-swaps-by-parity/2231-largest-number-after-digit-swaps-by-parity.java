class Solution {
    PriorityQueue<Integer>pq=new PriorityQueue<>();
     PriorityQueue<Integer>pq2=new PriorityQueue<>();
    public int largestInteger(int num) {
        char arr[]=new String(""+num).toCharArray();
        for(int i=0;i<arr.length;i++){
            int val=arr[i]-'0';
            if((val&1)==0)
                pq.add(val);
            else
                pq2.add(val);
        }
        StringBuilder sb=new StringBuilder("");
        while(num!=0){
            int r=num%10;
            if((r&1)==0)
                sb.append(pq.poll());
            else
                sb.append(pq2.poll());
            num/=10;
        }
        
       return  Integer.parseInt(sb.reverse().toString());
    }
}