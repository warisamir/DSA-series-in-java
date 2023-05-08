class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0) return 1;
        if(n==1) return 10;
        int c=9,ans=9;
        int t=n-1;
        while(t-->0){
          ans*=c--;  
        }
        return ans+countNumbersWithUniqueDigits(n-1);
    }
}