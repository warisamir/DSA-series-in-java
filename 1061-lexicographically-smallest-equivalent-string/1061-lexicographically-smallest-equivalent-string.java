class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
       ArrayList<ArrayList<Character>>adj=new ArrayList<>();
        for(int i=0;i<26;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<s1.length();i++){
            adj.get(s1.charAt(i)-'a').add(s2.charAt(i));
            adj.get(s2.charAt(i)-'a').add(s1.charAt(i));        
        }
        int ans=0;
        HashMap<Character,Character>hm=new HashMap<>();
        String res="";
        for(int i=0;i<baseStr.length();i++){
        if(!hm.containsKey(baseStr.charAt(i)-'a'))    
        { char min[]={'{'};
            boolean vis[]=new boolean[26];
         dfs(baseStr.charAt(i),vis,adj,min);
         hm.put(baseStr.charAt(i),min[0]);
        }
            res+=hm.get(baseStr.charAt(i));
        }
        return res;
    }
    void dfs(char src,boolean vis[],ArrayList<ArrayList<Character>>adj,char []min){
        vis[src-'a']=true;
        if(min[0]-'a'>src-'a')
            min[0]=src;
        for(char c:adj.get(src-'a'))
            if(!vis[c-'a'])
                dfs(c,vis,adj,min);
        
    }
}
   