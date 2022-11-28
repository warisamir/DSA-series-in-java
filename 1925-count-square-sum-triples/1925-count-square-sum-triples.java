class Solution {
    public int countTriples(int n) {
        int ct=0;
        for(int i=n;i>=5;i--){
            for(int j=i-1;j>(int)Math.sqrt(i*i/2.0);j--){
                int k=(int)Math.sqrt(i*i-j*j);
                if(k*k+j*j==i*i)
                    ct+=2;
            }
        }
        return ct;
    }
}