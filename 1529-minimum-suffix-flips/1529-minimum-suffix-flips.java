class Solution {
    public int minFlips(String target) {
       char cu='0';
        int count=0;
           for(char ch:target.toCharArray()){
           if(ch!=cu){
               count++;
               cu=ch;
           }
       }return count;
    }
}