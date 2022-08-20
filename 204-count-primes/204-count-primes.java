class Solution {
    public int countPrimes(int n) {
    
        if(n<2)
            return 0; 
        boolean arr[]=new boolean[n+1];
        Arrays.fill(arr,true);
      arr[0]=arr[1]=false;
        for(int i=2;i*i<=n;i++){
            if(arr[i]==false)continue;
            for(int m=i;i*m<=n;m++){
               arr[i*m]=false;
            }
        }
        int ct=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==true)ct++;
        }
        return ct;
        
    }

}