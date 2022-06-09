class Solution {
    public String reverseStr(String s, int k) {
        char c[]=s.toCharArray();
            for(int i=0;i<c.length;i+=k<<1)
                {
            int li = i - 1;
            int ri = Math.min(i + k, c.length);

            while(++li<--ri){
                c[li]^=c[ri];
                c[ri]^=c[li];
                c[li]^=c[ri];
            }
            }
        return String.valueOf(c);
    }
}

