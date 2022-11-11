class Solution {
    public int longestPalindrome(String s) {
       HashMap<Character,Integer>hm=new HashMap<>();
        for(char i:s.toCharArray()){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int res=0,ct=0;
        for(int i:hm.values()){
            if(i%2==0)
                res+=i;
            else{
                res+=i-1;
                ct=1;
            }
        }
        return res+ct;
    }
}