class MinStack {

    private int min;
    private Stack<Integer> s;
    private Stack<Integer> minS;

    public MinStack() {
        min = Integer.MAX_VALUE;
        s = new Stack<>();
        minS = new Stack<>();
    }
    
    public void push(int val) {
        this.s.push(val);
        if(val<=this.min){
            this.min = val;
            this.minS.push(val);
        }
        
    }
    
    public void pop() {
        if(this.s.peek() == this.min){
            this.s.pop();
            this.minS.pop();
            if(this.minS.isEmpty())
                this.min = Integer.MAX_VALUE;
            else
                this.min = this.minS.peek();
            return;
        }
        this.s.pop();
    }
    
    public int top() {
        return this.s.peek();
    }
    
    public int getMin() {
        return this.minS.peek();
    }
}
