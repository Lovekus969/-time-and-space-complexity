public class Stack {

    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    private Node top;

    // Push element on top of stack
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // Pop element from top
    public int pop() {
        if (top == null) throw new RuntimeException("Stack Underflow");
        int val = top.data;
        top = top.next;
        return val;
    }

    // Peek top element
    public int peek() {
        if (top == null) throw new RuntimeException("Stack is empty");
        return top.data;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek()); // 30

        System.out.println("Popped: " + stack.pop());       // 30
        System.out.println("Popped: " + stack.pop());       // 20

        System.out.println("Is stack empty? " + stack.isEmpty()); // false

        System.out.println("Popped: " + stack.pop());       // 10
        System.out.println("Is stack empty? " + stack.isEmpty()); // true
    }
}
