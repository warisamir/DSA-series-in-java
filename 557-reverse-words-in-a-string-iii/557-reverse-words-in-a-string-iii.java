class Solution {
    public String reverseWords(String s) {
        int j=0;
        //first we convert string to character array
    char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            //After that for the time we found space upto that we make the particular word to be reverse 
            //
            if(ch[i]==' ')
            {  reverse(j,i-1,ch);
            j=i+1;
        }
            //for the cond. if we got last string word
            else if(i==ch.length-1)
                reverse(j,i,ch);
        }
        //if empty()
        return new String(ch);
        
    }
    
        private void reverse(int st,int end, char ch[]){
           while(st<end){ char temp=ch[st];
           ch[st]=ch[end];
            ch[end]=temp;
            st++;end--;
                        }
        }
}