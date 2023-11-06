class SeatManager {
     int arr[];
    int id;
    public SeatManager(int n) {
       arr=new int[n];
        for(int i=1;i<=n;i++){
            arr[i-1]=i;
        }
        
    }
    
    public int reserve() {
       while(id<arr.length-1 && arr[id]==-1)
           id++;
        if(id<arr.length){
            int temp=arr[id];
            arr[id++]=-1;
            return temp;
        }
        return -1;
    }
    
    public void unreserve(int sn) {
        id=(sn<=id)?sn-1:id--;
        arr[sn-1]=sn;
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */