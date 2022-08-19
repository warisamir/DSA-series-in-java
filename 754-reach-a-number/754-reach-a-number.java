class Solution {
    public int reachNumber(int tar) {
    int x=0; 
        tar=Math.abs(tar);
        while(true){
            int rang=x*(x+1)/2;
            if(tar<=rang && ((rang-tar)&1)==0)      
            {  break;
            }
            x++;
        }
        return x;
    }
}