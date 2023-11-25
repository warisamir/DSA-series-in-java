class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int res[]=new int[k];
        HashMap<Integer,HashSet<Integer>>hm=new HashMap<>();
        for(int a[]:logs){
            int ekka=a[0];
            int log=a[1];
            if(!hm.containsKey(ekka))hm.put(ekka,new HashSet<>());
            hm.get(ekka).add(log);
        }
        for(int i:hm.keySet()){
            int uam=hm.get(i).size();
            res[uam-1]++;
        }
        return res;
    }
}