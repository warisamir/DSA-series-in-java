class Solution {
    public int maximumSwap(int num) {
        int s=0;
        int min=0;
        char arr[]=(num+"").toCharArray();
        int []r=new int[arr.length];
       for(int i=arr.length-2;i>=0;i--){
           if(i==arr.length-1)
               r[i]=-1;
           else if(i==arr.length-2)
               r[i]=arr.length-1;
           else
           {  if(arr[i+1]>arr[r[i+1]])
                   r[i]=i+1;
           else
               r[i]=r[i+1];
           }
       }
        for(int i=0;i<arr.length-1;i++){
             if(arr[i]<arr[r[i]])
             {
                 char temp=arr[i];
                arr[i]=arr[r[i]];
                 arr[r[i]]=temp;
                 break;
             }
        }
        return Integer.parseInt(new String(arr));
    }
    
}