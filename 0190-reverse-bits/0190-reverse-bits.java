public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
      int left=0,right=31;
        while(left<=right){
          n=swap(n,left,right);
           left++;right--; 
        }
        return n;
    }
public int swap(int n,int l,int r){
    int lmsk=1<<l;
    int rmsk=1<<r;
    boolean lchk= ((lmsk&n)!=0);
    boolean rchk= ((rmsk&n)!=0);
    if(lchk!=rchk)
    {  n=n^lmsk;
     n=n^rmsk;
    }
    return n;
}
}