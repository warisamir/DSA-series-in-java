class Solution {
//     public int compress(char[] ch) {
//         int sm=0;
//      HashMap<Character,Integer> hm=new HashMap<>();
//         for(int i=0;i<ch.length;i++)
//         {
//             if(hm.containsKey(ch[i])){
//             hm.put(ch[i],hm.get(ch[i])+1);
//         }
//            else{
//             hm.put(ch[i],1);   
//            }
//                }
              
//                for(int i=0;i<hm.size();i++){
                   
//                    sm+=hm.get(ch[i]);

//                }
              
//                return sm;
//                }
    
    
    
    public int compress(char[] chars) {
        int indexAns = 0, index = 0;
        while(index < chars.length){
            char currentChar = chars[index];
            int count = 0;
            while(index < chars.length && chars[index] == currentChar){
                index++;
                count++;
            }
            chars[indexAns++] = currentChar;
            if(count != 1)
                for(char c : Integer.toString(count).toCharArray()) 
                    chars[indexAns++] = c;
        }
        return indexAns;
    }
//         String s="";
//         int c=0;
//         int indexAns = 0, index = 0;
//         for(int i=0;i<chars.length;i++){
//             if(chars[i]==chars[i-1])
//                 c++;
//             else{
//                 if(c>1){
//                     s+=c;
//                     c=1;
//                 }
//                 s+=chars[i];
//             }
//         }
    
//     if(c>1){
//                     s+=c;
//                     c=1;
//                 }
//     s.Integer,totoCharArray();
//     return s;
//                }
               }