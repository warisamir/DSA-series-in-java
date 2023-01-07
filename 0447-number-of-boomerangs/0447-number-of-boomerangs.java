class Solution {
    public int numberOfBoomerangs(int[][] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
             HashMap<Integer,Integer>hm=new HashMap<>();
            for(int j=0;j<arr.length;j++){
             int dis=(arr[i][0]-arr[j][0])*(arr[i][0]-arr[j][0])+(arr[i][1]-arr[j][1])*(arr[i][1]-arr[j][1]);
                hm.put(dis,hm.getOrDefault(dis,0)+1);
            }
            for(int k:hm.values()){
             sum+=k*(k-1);
            }
        }
        return sum;
    }
}