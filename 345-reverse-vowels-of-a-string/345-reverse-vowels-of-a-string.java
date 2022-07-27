class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb=new StringBuilder(s);
        String ch="aeiouAEIOU";
        int li=0;
        int ri=sb.length()-1;
            while(li<ri){
                while(li<ri &&ch.indexOf(sb.charAt(li))==-1){
                    li++;
                
                }
                while(li<ri &&ch.indexOf(sb.charAt(ri))==-1){
                    ri--;
                }
                char c=sb.charAt(li);
                sb.setCharAt(li,sb.charAt(ri));
                sb.setCharAt(ri,c);
                li++;ri--;
            }    
        return sb.toString();
    }
}