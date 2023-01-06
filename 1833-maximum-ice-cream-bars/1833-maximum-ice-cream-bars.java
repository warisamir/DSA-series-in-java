class Solution {
    public int maxIceCream(int[] arr, int coins) {
        Arrays.sort(arr);
        int sum=0,ct=0;
        for(int k:arr){
            if(k<=coins)
            {coins-=k;
             ct++;
            }else break;
        }
        return ct;
    }
}