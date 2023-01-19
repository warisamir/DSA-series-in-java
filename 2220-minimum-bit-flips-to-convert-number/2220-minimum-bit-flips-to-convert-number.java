class Solution {
    public int minBitFlips(int s, int g) {
       return Integer.bitCount(s^g);
    }
}

