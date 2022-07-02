class Solution {
    public int maxArea(int h, int w, int[] hori, int[] ver) {
       int x=diff(hori,h);
        int y=diff(ver,w);
       return (int) ((long)x * (long)y % 1000000007L);
    }
    public int diff(int []a,int len){
        Arrays.sort(a);
        int mac=a[0];
        for(int i=1;i<a.length;i++){
            mac=Math.max(a[i]-a[i-1],mac);
        }
        mac=Math.max(mac,len-a[a.length-1]);
        return mac;
    }
}