class Solution {
    public int countEven(int num) {
        if(num==1) return 0;
        int c=0;
        for(int i=2;i<=num;i++){
        if(digitSum(i)%2==0)
            c++;
        }
        return c;
    }
    public int digitSum(int i){
     int s=0;
        while(i>0){
            s+=i%10;
            i/=10;
        }
        return s;
    }
}