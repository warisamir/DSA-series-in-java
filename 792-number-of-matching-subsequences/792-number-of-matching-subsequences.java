class Solution {
    public int numMatchingSubseq(String s, String[] words) {
      HashMap<Character,Queue<String>>hm=new HashMap<>();
        int count =0;
        for(int i=0;i<s.length();i++){
            hm.putIfAbsent(s.charAt(i),new LinkedList<>());
        }
        for(String w:words){
            char st=w.charAt(0);
            if(hm.containsKey(st))
                hm.get(st).offer(w);
        }
        for(int i=0;i<s.length();i++){
            char st=s.charAt(i);
            Queue<String>S=hm.get(st);
            int q=S.size();
            for(int k=0;k<q;k++){
                String str=S.poll();
                if(str.substring(1).length()==0)count++;
                else{
                    if(hm.containsKey(str.charAt(1)))
                        hm.get(str.charAt(1)).add(str.substring(1));
                }
            }
        }return count;
    }
}