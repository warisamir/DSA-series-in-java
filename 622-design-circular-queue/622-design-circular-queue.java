class MyCircularQueue {
     int[] arr = null;
    int addedCount = 0;

    public MyCircularQueue(int k) {
        arr = new int[k];
        addedCount = 0;
    }
    
    public boolean enQueue(int value) {
        if(addedCount >= arr.length)
            return false;
        
        arr[addedCount++] = value;
        return true;
    }
    
    public boolean deQueue() {
        if(addedCount == 0)
            return false;
        
        for(int i = 0; i < addedCount - 1; i++)
            arr[i] = arr[i+1];
        addedCount--;
        return true;
    }
    
    public int Front() {
        return (addedCount == 0) ? -1 : arr[0];        
    }
    
    public int Rear() {
        return (addedCount == 0) ? -1 : arr[addedCount - 1];
    }
    
    public boolean isEmpty() {
        return addedCount == 0;
    }
    
    public boolean isFull() {
        return addedCount >= arr.length;
    }

}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */