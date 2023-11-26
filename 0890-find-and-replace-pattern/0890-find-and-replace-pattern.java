class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
         List<String> al = new ArrayList();
        int count1=0;
        HashMap<Character,Integer> hp1 = new HashMap();
        String res="";
        for(int i=0;i<pattern.length();i++){
            if(hp1.containsKey(pattern.charAt(i))){
                    res += ""+hp1.get(pattern.charAt(i));
                }else{
                    count1++;
                    hp1.put(pattern.charAt(i),count1);
                }
                res += ""+hp1.get(pattern.charAt(i));
        }
        for(String str : words){
            String temp1 = "";
            hp1.clear();
            count1=0;
            for(int i=0;i<str.length();i++){
                if(hp1.containsKey(str.charAt(i))){
                    temp1 += ""+hp1.get(str.charAt(i));
                }else{
                    count1++;
                    hp1.put(str.charAt(i),count1);
                }
                temp1 += ""+hp1.get(str.charAt(i));
            }
            if(res.equals(temp1)) al.add(str);
            temp1="";
        }
        return al;
    }
}