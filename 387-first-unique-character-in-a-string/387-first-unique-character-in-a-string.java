class Solution {
    public int firstUniqChar(String s) {
        int arr[]=new int[26];
        for(char c:s.toCharArray()){
            arr[c-'a']++;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(arr[ch-'a']==1)
                return i;
        }
        return -1;
    }
}