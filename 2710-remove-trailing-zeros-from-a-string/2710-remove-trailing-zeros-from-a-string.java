class Solution {
    public String removeTrailingZeros(String num) {
       //  StringBuilder sb=new StringBuilder(num);
       //  int i=sb.length()-1;
       // while(sb.charAt(i)=='0'){
       //          sb=sb.deleteCharAt(i);
       //     i--;
       //  }
       //  return sb.toString();
        return num.replaceAll("0+$","");
    }
}