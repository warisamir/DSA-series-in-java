class Solution {
    public int minAddToMakeValid(String s) {
       int val=0,ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            val+=(ch=='(' )?1:-1;
        
                if(val==-1)
                {
                    val++;
                    ans++;
                }   
        }
       return val+ans;
    }
}