class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        //use two pointer type approach
        int j=piles.length-2;
        int i=0;
        int pro=0;
        while(i<piles.length/3){
            pro+=piles[j];
            j-=2;
            i++;
        }
        return pro;
    }
}