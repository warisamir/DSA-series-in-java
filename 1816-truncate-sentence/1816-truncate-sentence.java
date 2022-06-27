class Solution {
    public String truncateSentence(String s, int k) {
        int i;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
            if(--k<=0)
                break;
            }
        }
        return s.substring(0,i);
    }
}