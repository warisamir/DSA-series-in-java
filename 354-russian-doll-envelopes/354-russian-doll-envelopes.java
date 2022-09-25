class Solution {
    public int maxEnvelopes(int[][] arr) {
        //first make sort on the first element of all array
        //then make lis array for arranging second elemnt array
       Arrays.sort(arr,(a1,a2)->
                   {
        if(a1[0]!=a2[0])
            return a1[0]-a2[0];
         else
      return a2[1]-a1[1];
                   }) ;
        
      int tails[]=new int[arr.length];
        int len=1;
        tails[0]=arr[0][1];
        for(int i=1;i<arr.length;i++){
            if(arr[i][1]>tails[len-1])
            {
                len++;
                tails[len-1]=arr[i][1];
            }else{
                int idx=Arrays.binarySearch(tails,0,len-1,arr[i][1]);
                if(idx<0){
                    idx=-idx;
                    idx=idx-1;
                }
                tails[idx]=arr[i][1];
            }
        }
        return len;
    }
}