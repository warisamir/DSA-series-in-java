class Solution {
    public boolean canReach(int[] A, int i) {
        return 0<=i && i<A.length && A[i] >= 0 && ((A[i]=-A[i])==0 || canReach(A,i+A[i]) || canReach(A,i-A[i]));
    }
}