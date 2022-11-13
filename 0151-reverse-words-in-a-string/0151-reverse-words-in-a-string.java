class Solution {
    public String reverseWords(String s) {
    //    StringBuilder sb = new StringBuilder();
    //     for(int i= s.length()-1; i>=0; i--){
    //         while(i>=0 && s.charAt(i) == ' ') i--;
    //         if(i < 0) break;
    //         /* if sb is empty, which means it is first word met, simple skip, and if it is not, when we reach here, the string is not done processing, so append a space.
    //         */
    //         if(sb.length() != 0) sb.append(' ');
    //         StringBuilder w = new StringBuilder();
    //         /* Add the string in reverse order. */
    //         while(i>=0 && s.charAt(i) != ' ') w.append(s.charAt(i--));
    //         sb.append(w.reverse());
    //     }
    //     return sb.toString();
    // }
        String s1[]=s.trim().split(" +");
        String s2="";
        for(int i=s1.length-1;i>=0;i--){
            s2+=s1[i];
            if(i!=0)
                s2+=" ";
            
        }
        return s2;
    }
}