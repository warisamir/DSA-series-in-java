class Solution {
    public int subtractProductAndSum(int n) {
        int pro=1,sum=0;
        while(n>0){
        int b=n%10;
            pro*=b;
            sum+=b;
            n/=10;
        }
        return pro-sum;
    }
}