class Solution {
    public int lengthOfLongestSubstring(String s) {
   HashMap<Character,Integer>hm=new HashMap<>();
        int start = 0;
        int maxLen = 0;

        for(int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if(hm.containsKey(currChar)) {
                start = Math.max(hm.get(currChar) + 1, start);
            }
            hm.put(currChar, i);
            maxLen = Math.max(i - start + 1, maxLen);
        } 
        return maxLen;  
    }
}