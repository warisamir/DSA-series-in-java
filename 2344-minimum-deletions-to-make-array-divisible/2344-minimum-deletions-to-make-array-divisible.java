class Solution {
    public int minOperations(int[] nums, int[] arr) {
          Arrays.sort(nums);
    int div = Arrays.stream(arr).reduce((a, b) -> gcd(a, b)).getAsInt();
        int c=0;
    for(int k:nums){ 
        if(div%k==0)
            return c;
         c++; }  
        return -1;  
        }
    public int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}