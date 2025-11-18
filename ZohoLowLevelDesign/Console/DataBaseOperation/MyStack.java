package ZohoLowLevelDesign.Console.DataBaseOperation;

class MyStack {
    private MyMap[] arr;
    private int top;

    MyStack() {
        arr = new MyMap[50];  // max nested transactions
        top = -1;
    }

    public void push(MyMap m) {
        arr[++top] = m;
    }

    public MyMap pop() {
        if (top == -1) return null;
        return arr[top--];
    }

    public void clear() {
        top = -1;
    }
}
