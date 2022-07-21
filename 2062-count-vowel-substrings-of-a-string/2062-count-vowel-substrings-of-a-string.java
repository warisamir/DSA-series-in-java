class Solution {
    public int countVowelSubstrings(String s) {
        int ct=0;
        for(int i=0;i<s.length();i++){
            HashSet<Character>st=new HashSet<>();
            for(int j=i;j<s.length();j++){
                if(!Vow(s.charAt(j)))
                   break;
                   st.add(s.charAt(j));
              if(st.size()==5)ct++;
                   }
                   
        }
             return ct;      
    }
                   public  boolean Vow(char ch){
                       if(ch=='a'|| ch=='o'||ch=='u'||ch=='e'||ch=='i')
                          return true; 
                       return false;
                   }
}