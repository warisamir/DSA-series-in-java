class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        // int n=arr.length;
       int t=0;
        int i=0;
       while(tickets[k]!=0){
           if(tickets[i]!=0){
               t++;
               tickets[i]--;
           }
           if(i==tickets.length-1)
               i=0;
           else
               i++;
       }
        return t;
    }
}