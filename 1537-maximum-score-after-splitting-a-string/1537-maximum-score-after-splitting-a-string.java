class Solution {
    public int maxScore(String s) {
        int n=s.length();
        int zero=0,one=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1')
            one++;
        }
        int max=0;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)=='0')zero++;
            else one--;
            max=Math.max(max,zero+one);
        }
        return max;
    }
}