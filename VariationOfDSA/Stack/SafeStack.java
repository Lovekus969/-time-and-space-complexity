public class SafeStack {

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    // Push element onto stack
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;  // new node points to current top
        top = newNode;       // update top to new node
        System.out.println("Pushed: " + data);
    }

    // Pop element from stack, throws exception if empty
    public int pop() {
        if (top == null) throw new RuntimeException("Stack Underflow: Cannot pop from empty stack.");
        int val = top.data;
        top = top.next;
        System.out.println("Popped: " + val);
        return val;
    }

    // Safe pop: returns null if empty, no exception
    public Integer safePop() {
        if (top == null) {
            System.out.println("Stack is empty, safePop returns null.");
            return null;
        }
        int val = top.data;
        top = top.next;
        System.out.println("Safe popped: " + val);
        return val;
    }

    // Peek top element, throws exception if empty
    public int peek() {
        if (top == null) throw new RuntimeException("Stack is empty: Cannot peek.");
        System.out.println("Peeked: " + top.data);
        return top.data;
    }

    // Safe peek: returns null if empty
    public Integer safePeek() {
        if (top == null) {
            System.out.println("Stack is empty, safePeek returns null.");
            return null;
        }
        System.out.println("Safe peeked: " + top.data);
        return top.data;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        SafeStack stack = new SafeStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.peek();

        stack.pop();
        stack.safePop();

        System.out.println("Safe peek returns: " + stack.safePeek());

        stack.pop();
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Try safePop on empty stack
        stack.safePop();

        // Uncommenting next line throws exception:
        // stack.pop();
    }
}
