class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=words.length;
        int prefix[]=new int[n+1];
        HashSet<Character>hs=new HashSet<>(Arrays.asList('a','e','o','i','u'));
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i];
            if(hs.contains(words[i].charAt(0)) && hs.contains(words[i].charAt(words[i].length()-1)))
            prefix[i+1]++;
        }
        int ans[]=new int[queries.length];
        for(int i=0;i<ans.length;i++){
            ans[i]=prefix[queries[i][1]+1]-prefix[queries[i][0]];
        }
        return ans;
    }
}