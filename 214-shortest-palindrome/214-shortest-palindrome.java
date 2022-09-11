class Solution {
    public String shortestPalindrome(String s) {
        String str=s+"%"+new StringBuilder(s).reverse().toString();
        int i=1,len=0;
        int lps[]=new int[str.length()];
        while(i<lps.length){
            if(str.charAt(i)==str.charAt(len)){
                lps[i]=len+1;i++;len++;
            }
            else if(len==0){
                lps[i]=len;
                i++;
            }
            else
                len=lps[len-1];
        }
        int ppl=lps[lps.length-1];
        String s1=s.substring(ppl);
        return new StringBuilder(s1).reverse().toString()+s;
        
    }
}