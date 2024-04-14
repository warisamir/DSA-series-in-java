class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            sum+=Math.abs(s.charAt(i+1)-s.charAt(i));

        }
        return sum;
    }
}