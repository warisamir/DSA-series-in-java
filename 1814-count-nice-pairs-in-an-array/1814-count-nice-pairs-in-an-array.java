class Solution {  
    public int countNicePairs(int[] nums) {
       int n=nums.length;
        long res=0;
        long mod=(long)Math.pow(10,9)+7L;
      HashMap<Integer,Integer>hm=new HashMap<>();
            for(int i:nums){
                int key=i-rev(i);
                hm.put(key,hm.getOrDefault(key,0)+1);
            }
    
        for(Integer fre:hm.keySet()){
            int ct=hm.get(fre);
        res+=ct*(ct-1L)/2L;
        }
        return (int)(res%mod);
    } 
    public int rev(int n){
            int res=0;
       while(n!=0){
          int b=n%10;
           res=res*10+b;
          n=n/10;
           
}return res;
}
}