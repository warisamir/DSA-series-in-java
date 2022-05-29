class Solution {
    public int maxProduct(String[] word) {
       int n=word.length;
        List<Set<Character>>ls=new ArrayList(n);
        int mx=0;
        for(String w:word){
            Set<Character>set=new HashSet();
            ls.add(set);
            for(int i=0;i<w.length();i++){
                set.add(w.charAt(i));
            }
        }
          
        for(int i=0;i<n;i++){
            Set<Character>set1=ls.get(i);
            for(int j=i+1;j<n;j++){
                boolean com=false;
                Set<Character>set2=ls.get(j);
                for(Character c:set1){
                    if(set2.contains(c)){
                        com=true;
                        break;
                    }
                }
            
            if(!com)
 mx=Math.max(mx,word[i].length()*word[j].length());
        }
        }
        return mx;
    }
}