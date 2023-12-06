class Solution {
    public int totalMoney(int n) {
        int d=n%7;
        int w=n/7;
        return (n*(w+7)+d*(d+w-6))>>1;
    }
}
 // int w = n / 7;
 //        int d = n % 7;
 //        return (n * (w + 7) + d * (d + w - 6)) >> 1;