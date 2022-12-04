class Solution {
    public String sortSentence(String s) {
        String s1[]=s.split(" ");
       String res[]=new String[s1.length];
        int ch=0;
        for(String w:s1){
         ch=(int)w.charAt(w.length()-1)-'0';
            res[ch-1]=w;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<res.length;i++){
            sb.append(res[i].substring(0,res[i].length()-1));
            if(i!=res.length-1)
            sb.append(" ");
        }
        return sb.toString();
    }
}