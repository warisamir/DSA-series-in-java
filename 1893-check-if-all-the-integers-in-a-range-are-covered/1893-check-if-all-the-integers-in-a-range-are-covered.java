class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        
        Set<Integer> hs = new HashSet<>();
        for(int[] range : ranges) {
            for(int i = range[0]; i <= range[1]; i++) {
                hs.add(i);
            }
        }

    //
        for(int i=left;i<=right;i++){
            if(!hs.contains(i))return false;
        }
        return true;
    }
}