public class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
    public void push(int value) {
        if (top >= maxSize - 1) {
            System.out.println("Stack is full. Cannot push element.");
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed element: " + value);
        }
    }
    public int pop() {
        if (top < 0) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1;
        } else {
            int value = stackArray[top--];
            System.out.println("Popped element: " + value);
            return value;
        }
    }
    public int peek() {
        if (top < 0) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            System.out.println("Top element: " + stackArray[top]);
            return stackArray[top];
        }
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.peek();
        stack.pop();
        stack.peek();

        stack.isEmpty();
        stack.isFull();
    }
}