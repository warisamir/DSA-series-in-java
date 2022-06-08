class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       List<Integer> ls=new ArrayList<>();
        int s1=s.length(),p1=p.length();
        int hm[]=new int[26];
        if(s1==0 || s==null || s1<p1)return ls;
        for(char c:p.toCharArray()){
            hm[c-'a']++;
        }
        int r=0,l=0;
        while(r<s1){
            int c=s.charAt(r)-'a';
            if(hm[c]>0){
                --hm[c];r++;
            }
            else if(r-l==p1){
                ls.add(l);
                ++hm[s.charAt(l++)-'a'];
            }
            else if(l<r){
                ++hm[s.charAt(l++)-'a'];
            }
            else{
                l++;
                r++;
            }
        }
        if(r-l==p1)ls.add(l);
        return ls;
    }
}