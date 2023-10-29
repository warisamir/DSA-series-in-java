class Solution {
    public int poorPigs(int buckets, int mtod, int mtot) {
        int test=mtot/mtod;
        int st=1;
        int num=0;
        while(st<buckets){
            st*=(test+1);
            num++;
        }
        return num;
    }
}