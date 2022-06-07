class Solution {
    public void merge(int[] num1, int m, int[] num2, int n) {
        if(n==0)return;
        int end=n+m-1;
       m--; n--;
        while(n>=0){
            if(m>=0 && num1[m]>num2[n])
            { num1[end]=num1[m];
             m--;
            }
            else{
                num1[end]=num2[n];
                n--;
            }
            end--;
        }
        return ;
    }
}