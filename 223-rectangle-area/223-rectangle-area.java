class Solution {
    public int computeArea(int a,int b,int c,int d,int e,int f,int g,int h) {
       int a1= (c-a)*(d-b);
        int a2=(g-e)*(h-f);
        int loop=Math.max(Math.min(c,g)-Math.max(a,e),0)*Math.max(Math.min(d,h)-Math.max(b,f),0);
        return a1+a2-loop;
    }
}