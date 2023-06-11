class Solution {
    public int[] twoSum(int[]a, int t){
     int n=1;
        while(true){
            for(int i=0;i<a.length-n;i++){
                if(a[i]+a[i+n]==t)
                    return new int[]{i,i+n};
            }
            n++;
        }
}
}