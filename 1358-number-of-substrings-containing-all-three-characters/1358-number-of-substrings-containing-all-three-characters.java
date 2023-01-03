class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int ans=0,j=0;
        int hm[]=new int[3];
        for(int i=0;i<n;i++){
            hm[s.charAt(i)-'a']++;
            while(hm[0]>0 && hm[1]>0 && hm[2]>0){
              ans+=n-i;
            hm[s.charAt(j++)-'a']--;
            }
        }
        return ans;
    }
}