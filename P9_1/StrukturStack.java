package P9_1;

public class StrukturStack {
    private int[] array;
    private int capacity;
    private int TOP;
    public final int MIN = -1;

    public StrukturStack(int capacity) {
        array = new int[capacity];
        this.capacity = capacity;
        TOP = MIN;
    }

    public boolean isFull() {
        return TOP == capacity - 1;
    }

    public boolean isEmpty() {
        return TOP == MIN;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            TOP++;
            array[TOP] = data;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong, tidak bisa pop");
            return -1;
        } else {
            int data = array[TOP];
            TOP--;
            return data;
        }
    }

    public int size() {
        return TOP + 1;
    }

    public int top() {
        if (isEmpty()) {
            return -1;
        }
        return array[TOP];
    }

    public void printStack() {
        for (int i = TOP; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
