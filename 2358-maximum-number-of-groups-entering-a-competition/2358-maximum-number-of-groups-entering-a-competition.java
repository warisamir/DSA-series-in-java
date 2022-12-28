class Solution {
    public int maximumGroups(int[] grades) {
       if(grades.length<=2)
           return 1;
        int n=grades.length;
        int i=0,inc=0;
        while(i<=n){
            i+=inc++;
        }
        return inc-2;
    }
}