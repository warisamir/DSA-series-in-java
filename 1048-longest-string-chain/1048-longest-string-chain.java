class Solution {
    public int longestStrChain(String[] words) {
        HashMap<String,Integer> hm=new HashMap<>();
        int res=0;
        Arrays.sort(words,(a,b)-> a.length()-b.length());
        for(String w:words){
            hm.put(w,1);
            for(int i=0;i<w.length();i++){
                StringBuilder sb=new StringBuilder(w);
                String n=sb.deleteCharAt(i).toString();
                if(hm.containsKey(n))
                    hm.put(w,Math.max(hm.get(w),hm.get(n)+1));
        }
        res=Math.max(res,hm.get(w));
    }
        return res;
    }
}