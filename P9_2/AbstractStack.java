package P9_2;

public class AbstractStack {
    protected int[] arr;
    protected int top;

    public AbstractStack(int capacity) {
        arr = new int[capacity];
        top = -1;
    }

    public void push(int value) {
        arr[++top] = value;
    }

    public int pop() {
        return arr[top--];
    }

    public int size() {
        return top + 1;
    }
}
