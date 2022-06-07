class Solution {
    public int numIslands(char[][]ar ) {
        int count=0;
       for(int i=0;i<ar.length;i++){
           for(int j=0;j<ar[0].length;j++){
               if(ar[i][j]=='1'){
                   count++;
               fun(ar,i,j);
               }
           }
           }
        return count;
    }
    public void fun(char arr[][],int i,int j){
        if(i<0 || j<0 ||i>=arr.length|| j>=arr[0].length||arr[i][j]=='0')
            return ;
        arr[i][j]='0';
        fun(arr,i,j+1);
        fun(arr,i+1,j);
        fun(arr,i,j-1);
        fun(arr,i-1,j);
    }
}