class Solution {
    class Pair{
        String s;
        int num;
        Pair(String s,int num){
            this.s=s;
            this.num=num;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String>set=new HashSet<>();
        for(String s:wordList){
            set.add(s);
        }
        LinkedList<Pair>que=new LinkedList<>();
        que.add(new Pair(beginWord,1));
        set.remove(beginWord);
        while(!que.isEmpty()){
            Pair node=que.removeFirst();
            String ns=node.s;
            int step=node.num;
            if(ns.equals(endWord))
                return step;
            
        for(int i=0;i<ns.length();i++){
                for(char ch='a';ch<='z';ch++){
                    char [] replArr=ns.toCharArray();
                    replArr[i]=ch;
                    String newStr=new String(replArr);
                    
                    if(set.contains(newStr)){
                        que.addLast(new Pair(newStr,step+1));
                        set.remove(newStr);
                    }
                }
        }
        }
            return 0;
        }
        
        
}