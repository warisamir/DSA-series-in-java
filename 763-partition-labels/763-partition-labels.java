class Solution {
    public List<Integer> partitionLabels(String s) {
        int map[]=new int[26];
        ArrayList<Integer>ls=new ArrayList<>();
        Arrays.fill(map,-1);
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map[c-'a']=i;
        }
        int st=0,e=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            e=Math.max(e,map[c-'a']);
            if(i==e)
            {
                int l=e-st+1;
                ls.add(l);
                st=i+1;
                e=st;
            }
        }
        return ls;
    }
}