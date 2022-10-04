class LUPrefix {
    int arr[];
    int i=1;
    public LUPrefix(int n) {
    this.arr=new int[n];
        this.i=0;
   
    }
    
    public void upload(int v) {
            arr[v-1]=1;
        while(i<arr.length && arr[i]==1)
            i++;
    }
    
    public int longest() {
        
            return i; 
    }
}

/**
 * Your LUPrefix object will be instantiated and called as such:
 * LUPrefix obj = new LUPrefix(n);
 * obj.upload(video);
 * int param_2 = obj.longest();
 */