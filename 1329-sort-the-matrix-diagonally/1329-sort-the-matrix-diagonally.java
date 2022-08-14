class Solution {
    public int[][] diagonalSort(int[][] mat) {
        Map<Integer,PriorityQueue<Integer>>hm=new HashMap<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(hm.containsKey(i-j)==false){
            hm.put(i-j,new PriorityQueue<>());
            }
            hm.get(i-j).add(mat[i][j]);
        }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                mat[i][j]=hm.get(i-j).remove();
            }
        }
        return mat;
    }}
