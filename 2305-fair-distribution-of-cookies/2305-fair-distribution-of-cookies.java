class Solution {
    int min=Integer.MAX_VALUE;
    public int distributeCookies(int[]arr, int k) {
     helpme(arr,0,new int[k]);
        return min;
    }
    public void helpme(int []arr,int n,int ch[]){
        if(n==arr.length){
            int max=-1;
            for(int i:ch)
             max=Math.max(max,i);
            min=Math.min(min,max);
            return ;
        }
        for(int c=0;c<ch.length;c++){
            ch[c]+=arr[n];
        helpme(arr,n+1,ch);
            ch[c]-=arr[n];
        }
    }
  
}