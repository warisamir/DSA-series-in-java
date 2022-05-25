class Solution {
    public int[] decode(int[] en, int f) {
        int arr[]=new int[en.length+1];
            arr[0]=f;
            for(int i=0;i<en.length;i++){
                arr[i+1]=en[i]^arr[i];
            }
        return arr;
    }
}