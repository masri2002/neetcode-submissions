class MinStack {

     ArrayList<Integer> stack;
    ArrayList<Integer> minStack;

    public MinStack() {
        stack = new ArrayList<>();
        minStack = new ArrayList<>();
    }

    public void push(int val) {
        stack.add(val);
        if (!minStack.isEmpty() && minStack.getLast() < val) {
            minStack.addFirst(val);
        } else {
            minStack.add(val);
        }
    }

    public void pop() {
        int val = stack.removeLast();
        minStack.remove(Integer.valueOf(val));
    }

    public int top() {
        return stack.getLast();
    }

    public int getMin() {
        return minStack.getLast();
    }
}
