class Solution {
    public int buyChoco(int[] price, int money) {
        Arrays.sort(price);
       return (money>=(price[0]+price[1]))? money-(price[0]+price[1]): money;   
    }
}