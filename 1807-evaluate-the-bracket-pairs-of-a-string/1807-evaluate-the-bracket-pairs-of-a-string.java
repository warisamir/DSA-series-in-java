class Solution {
    public String evaluate(String s, List<List<String>> ar) {
        Map<String,String>hm=new HashMap<>();
        List<String>ls=new ArrayList<>();
        for(List<String>l:ar){
            hm.put(l.get(0),l.get(1));
        }
      StringBuilder sb=new StringBuilder(),res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                while(s.charAt(++i)!=')')
                    sb.append(s.charAt(i));
            String s1=hm.get(sb.toString());
            res.append(s1==null?"?":s1);
          sb.setLength(0);
            continue;
        }
            if (s.charAt(i) != ')') res.append(s.charAt(i));
        }
        return res.toString();
    }
}