class Solution {
    public int minFlips(int a, int b, int c) {
        int f=0;
        for(;a!=0 || b!=0 ||c!=0; a>>=1, b>>=1,c>>=1){
            if(((a&1)|(b&1))!=(c&1))
                f+=((c&1)==1)?1:(a&1)+(b&1);
        }
        return f;
    }
}
