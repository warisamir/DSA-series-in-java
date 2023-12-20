class Solution {
    public int maxScore(String s) {
        int one=0,zero=0,max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0')zero++;
            else one++;
            if(i!=s.length()-1)max=Math.max(zero-one,max);
        }
        return max+one;
    }
}