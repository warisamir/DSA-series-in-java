class Solution {
    public int strStr(String s, String pat) {
        int lps[]=new int[pat.length()];
        findlps(lps,pat);
        int first=0,second=0;
        while(first<s.length() && second<pat.length()){
            if(s.charAt(first)==pat.charAt(second))
            {
                first++;second++;
            }
            else{
                if(second==0)
                    first++;
                else
                    second=lps[second-1]; 
            }
        }
        if(second==pat.length())
            return first-second;
        return -1;
    }
    void findlps(int lps[],String s){
        int pre=0,suf=1;
        while(suf<s.length()){
            if(s.charAt(suf)==s.charAt(pre)){
                lps[suf]=pre+1;
                suf++;pre++;
            }
            else{
                if(pre==0)
                {    
                    lps[suf]=0;
                    suf++;
                }
                else
                    pre=lps[pre-1];
            }
        }
    }
    
}