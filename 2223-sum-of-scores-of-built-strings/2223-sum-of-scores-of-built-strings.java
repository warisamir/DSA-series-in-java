class Solution {
    
    ////Z Algo
    public long sumScores(String s) {
        int z[]=new int[s.length()];
        int l=0,r=0;
        long ans=s.length();
        for(int i=1;i<z.length;i++){
            if(i>r){
                l=r=i;
                while(r<z.length && s.charAt(r)==s.charAt(r-l))
                { r++;}
                r--;
                z[i]=r-l+1;
            }
            else
            {
                int k=i-l;
                if(z[k]<r-i+1)
                    z[i]=z[k];
                else{
                    l=i;
                    while(r<z.length && s.charAt(r)==s.charAt(r-l))
                    {  r++;}r--;
                            z[i]=r-l+1;
                }
            }
            
        }
        for(int val:z)
            ans+=val;
        return ans;
    }
}