class Solution {
    public boolean canArrange(int[] arr, int k) {
        int fre[]=new int[k];
        for(int val:arr){
            val%=k;
            if(val<0)val+=k;
            fre[val]++;
        }
        if(fre[0]%2!=0)return false;
        for(int i=1;i<fre.length;i++){
            if(fre[i]!=fre[k-i])
                return false;
        }
        return true;
    }
}