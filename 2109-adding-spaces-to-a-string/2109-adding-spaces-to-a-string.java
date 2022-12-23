class Solution {
    public String addSpaces(String s, int[] sp) {
        StringBuffer sb=new StringBuffer(s);
        int k=0;
        for(int i=0;i<sp.length;i++){
             sb.insert(sp[i]+k," ");
            k++;
        }
       return sb.toString();
       
    }
}