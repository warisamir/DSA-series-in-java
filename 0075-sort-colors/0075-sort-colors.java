class Solution {
    public void sortColors(int[] arr) {
    int n=arr.length;
     int j=0,i=0,k=n-1;
     while(j<=k){
      if(arr[j]==0)
      {
        swap(arr,j,i);
        i++;j++;
      }
      else if(arr[j]==1)
      j++;
      else {
        swap(arr,j,k);
        k--;
      }
    }
}
    public static void swap(int[] arr, int i, int j) {
    
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}