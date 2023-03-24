class Solution {
    public int divide(int d, int div) {
         if (d == -2147483648 && div == -1) 
        return (2147483647);
        return d/div;
    }
}