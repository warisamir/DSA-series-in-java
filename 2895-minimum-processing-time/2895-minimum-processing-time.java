class Solution {
    public int minProcessingTime(List<Integer> pt, List<Integer> t) {
        Collections.sort(pt);
        Collections.sort(t, Collections.reverseOrder());
        int max=Integer.MIN_VALUE;
        for(int i=0;i<pt.size();i++){
            max=Math.max(max,t.get(i*4)+pt.get(i));
        }
        return max;
    }
}