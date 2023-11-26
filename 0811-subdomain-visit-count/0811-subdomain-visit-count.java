class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer>hm=new HashMap<>();
        for(String s:cpdomains){
            int j=s.indexOf(" ");
            int a=Integer.valueOf(s.substring(0,j));
            String cd=s.substring(j+1);
            for(int i=0;i<cd.length();i++){
                if(cd.charAt(i)=='.'){
                    String d=cd.substring(i+1);
                hm.put(d,hm.getOrDefault(d,0)+a);
                }
            }
            hm.put(cd,hm.getOrDefault(cd,0)+a);
        }
        List<String>res=new ArrayList<>();
        for(String dm:hm.keySet()){
            res.add(hm.get(dm)+" "+dm);
        }
        return res;
    }
}