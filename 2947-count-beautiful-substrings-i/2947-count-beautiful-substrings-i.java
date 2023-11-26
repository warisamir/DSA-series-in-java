class Solution {
    public int beautifulSubstrings(String s, int k) {
        int l=s.length();
        int ct=0;
        for(int i=0;i<l;i++){
            int c=0,v=0;
            for(int j=i;j<l;j++){
                char ch=s.charAt(j);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                {
                  v++;
                }
                int df=j-i+1;
                c=df-v;
                if(v==c && (v*c)%k==0)
                    ct++;
            }
        }
        return ct;
        
    }
}