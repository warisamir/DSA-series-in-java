class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int [][]indiceslist=new int[26][2];
        for(int indices[]:indiceslist){
            Arrays.fill(indices,-1);
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
           int []indices=indiceslist[c-'a'];
            if(indices[0]==-1)
                indices[0]=i;
            else
                indices[1]=i;
        }
        for(int i=0;i<distance.length;i++){
            if(indiceslist[i][0]!=-1 && indiceslist[i][1]!=-1)
            {    int dist=indiceslist[i][1]-indiceslist[i][0]-1;
            if(dist!=distance[i])
                return false;
            }
        }
        return true;
    }
}