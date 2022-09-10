class Solution {
    public String longestPrefix(String s) {
        int n=s.length();
        int lps[]=new int[n];
        int len=0;
        int i=1;
        while(i<n){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else {
                if(len!=0){
                len=lps[len-1];
            }
            else{
                lps[i]=len;
                i++;
            }
                 }
        }
    
        return s.substring(0,lps[n-1]);
    }
}