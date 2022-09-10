class Solution {
    public int numberOfWeakCharacters(int[][]arr) {
        Arrays.sort(arr,(a,b)->a[0]==b[0]?a[1]-b[1]:b[0]-a[0]);
        int max=arr[0][1];
        int ct=0;
        for(int i=0;i<arr.length;i++){
            int ar[]=arr[i];
            // System.out.println(max);
            if(max>ar[1])
                ct++;
            max=Math.max(max,ar[1]);
             // System.out.println(max);
        }
        return ct;
    }
}