class Solution {
    public void duplicateZeros(int[] arr) {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                l.add(arr[i]);
            }
            else
            {
                l.add(arr[i]);
                l.add(arr[i]);
        }
        
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=l.get(i);
        }
    }
}