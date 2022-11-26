class Solution {
    public String longestSubsequenceRepeatedK(String s, int k) {
        int hm[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hm[ch-'a']++;
        }
        ArrayList<Character>ls=new ArrayList<>();
        for(int i=0;i<26;i++){
            if(hm[i]>=k)
                ls.add((char)('a'+i));
        }
        String ans="";
        LinkedList<String> que=new LinkedList<>();
        que.addLast("");
        while(que.size()>0){
            String rem=que.removeFirst();
            for(char ch:ls){
                String next=rem+ch;
                if(ksub(s,next,k)){
                    que.addLast(next);
                    ans=next;
                }
            }
        }
        return ans;
    }
   public boolean ksub(String s,String sub,int k){
       int j=0,rep=0;
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)==sub.charAt(j))
           {
               j++;
               if(j==sub.length())
               {      rep++;
               j=0;
               if(rep==k)
                   return true;
           }
       }
       }
       return false;
   }
} 
