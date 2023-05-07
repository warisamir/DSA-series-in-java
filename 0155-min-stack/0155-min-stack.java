class MinStack {
Stack<Long>st=new Stack<>();
    long min=Long.MAX_VALUE;
    
    public void push(int val) {
       if(st.size()==0)
       {  st.push(1l*val);
        min=(long)val;}
        else if(val<min){
            st.push(2l*val-min);
            min=(long)val;
        }
        else{
            st.push(1l*val);
        }
    }
    
    public void pop() {
        if(st.peek()<min){
            min=2l*min-st.pop();
        }
        else{
            st.pop();
        }
    }
    
    public int top() {
        if(st.peek()<min)
            return (int)min;
       
        long top=st.peek();
            return (int)top;
    }
    
    public int getMin() {
       return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */