class Solution {
    public int minBitFlips(int s, int g) {
       var f=0;
        for(;s!=0 || g!=0 ;s>>=1,g>>=1)
            if((s&1)!=(g&1))
                f++;
        return f;
    }
}

