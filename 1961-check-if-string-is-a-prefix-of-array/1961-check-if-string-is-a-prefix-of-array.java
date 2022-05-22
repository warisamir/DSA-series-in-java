class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb=new StringBuilder();
            boolean v= false;
        for(int i=0;i<words.length;i++){
            sb.append(words[i]);
            if(sb.toString().equals(s))
                v=true;
        }
        return v;
    }
}