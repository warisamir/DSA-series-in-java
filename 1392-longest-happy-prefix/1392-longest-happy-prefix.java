class Solution {
    public String longestPrefix(String s) {
        int n=s.length();
        int i=1,len=0,max=0;
        int lps[]=new int[n];
        while(i<s.length()){
            if(s.charAt(i)==s.charAt(len)){
                lps[i]=len+1;
                len++;i++;
            }
            else if(len==0)
            {
                lps[i]=len;i++;
            }
            else
                len=lps[len-1];
        }
       
        return s.substring(0,lps[n-1]);
    }
}