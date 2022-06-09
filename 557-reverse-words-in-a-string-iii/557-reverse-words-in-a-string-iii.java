class Solution {
    public String reverseWords(String s) {
        String s1[]=s.split(" ");
        StringBuilder s3=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for(int i=0;i<s1.length;i++){
            s3=new StringBuilder(s1[i]);
            s3.reverse();
            s2.append(s3).append(" ");
        }
        return s2.toString().trim();
    }
}