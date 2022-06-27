class Solution {
    public int minPartitions(String n) {
        int i=0;
        int max=0;
        for(;i<n.length();i++){
            max=Math.max(max,n.charAt(i)-'0');
        }
        return max;
    }
}