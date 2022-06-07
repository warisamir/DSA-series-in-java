class Solution {
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
     List<Integer>l=new ArrayList<>();
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<words.length;i++){
            int wmsk=createmsk(words[i]);
            if(hm.containsKey(wmsk)){
           int oldfreq = hm.get(wmsk);
    			int newfreq = oldfreq+1;
    			hm.put(wmsk,newfreq);
        }
            else
    		{
    			hm.put(wmsk,1);
    		}
    	}
        for(String i:puzzles){
            int pmsk=createmsk(i);
            char fch=i.charAt(0);
            int f=1<<(fch-'a');
            int sb=pmsk;
            int c=0;
            while(sb!=0){
                boolean ischpre=((sb&f)==f)?true:false;
                boolean valid=hm.containsKey(sb);
                if(ischpre==true && valid==true)
                    c+=hm.get(sb);
                sb=(sb-1) & pmsk;
            }
            l.add(c);
        }
        return l;
    }
private int createmsk(String st){
    int msk=0;
    for(int i=0;i<st.length();i++){
        int b=st.charAt(i)-'a';
        msk=msk|(1<<b);
    }
    return msk;
}  
        
    
}