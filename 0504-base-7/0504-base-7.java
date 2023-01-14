class Solution {
    public String convertToBase7(int n) {
        // StringBuilder sb=new StringBuilder();
        long res=0,pow=1;
        while(n!=0){
            int rem=n%7;
            res=res+pow*rem;
            n/=7;
            pow*=10;
        }
        return String.valueOf(res);
    }
}