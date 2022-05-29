class Solution {
    public int maxProduct(String[] word) {

   int n=word.length;
        int []bm=new int[n];
        int mx=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<word[i].length();j++){
                int id=word[i].charAt(j)-'a';
                bm[i] |=(1<<id);
            }
            for(int j=0;j<i;j++){
                if((bm[i] &bm[j])==0)
                    mx=Math.max(mx,word[i].length()*word[j].length());
            }
        }
                               return mx;
    }
}
    