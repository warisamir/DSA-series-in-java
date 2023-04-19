class Solution {
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
     List<Integer>l=new ArrayList<>();
        HashMap<Integer,Integer>hm=new HashMap<>();
       
        for(String wd:words){
            int mask=0;
            for(int i=0;i<wd.length();i++){
              mask|=(1<<wd.charAt(i)-'a');
            }
            hm.put(mask,hm.getOrDefault(mask,0)+1);
            }
        ArrayList<Integer>res=new ArrayList<>();
        for(String puzz:puzzles){
            int pmsk=0;
          for(int i=0;i<puzz.length();i++){
              int bit=puzz.charAt(i)-'a';
              pmsk=pmsk|((1<<bit));
          }
           int psub=pmsk;
            int ct=0;
           int firs=1<<(puzz.charAt(0)-'a');
            while(true){
                if((psub &firs)==firs && hm.containsKey(psub)){
                    ct+=hm.get(psub);
                }
                if(psub==0)break;
                    psub=(psub-1) &pmsk;
            }
            l.add(ct);
        }
        return l;
    }
    
}