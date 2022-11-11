class Solution {
    public String[] findWords(String[] words) {
      ArrayList<String>ls=new ArrayList<>();
       String s[]={"qwertyuiopQWERTYUIOP","asdfghjklASDFGHJKL","zxcvbnmZXCVBNM"};
        for(int i=0;i<words.length;i++){
            String s2=words[i];
            int ct=0,ct2=0,ct3=0;
            for(char ch:s2.toCharArray()){
                if(s[0].contains(ch+""))
                    ct++;
                else if(s[1].contains(ch+""))
                    ct2++;
                else if (s[2].contains(ch+""))
                    ct3++;
            }
            if(ct==s2.length() || ct2==s2.length() || ct3==s2.length())
                ls.add(s2);
        }
        String st[]=new String[ls.size()];
        ls.toArray(st);
        return st;
    }
}