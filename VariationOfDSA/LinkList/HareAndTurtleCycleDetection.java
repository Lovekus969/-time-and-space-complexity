public class HareAndTurtleCycleDetection {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Detect cycle using hare and turtle pointers
    public static boolean hasCycle(Node head) {
        Node turtle = head;
        Node hare = head;

        while (hare != null && hare.next != null) {
            turtle = turtle.next;           // Turtle moves 1 step
            hare = hare.next.next;          // Hare moves 2 steps

            if (turtle == hare) {
                return true;                // Cycle detected
            }
        }
        return false;                       // No cycle
    }

    public static void main(String[] args) {
        // Create linked list nodes
        Node head = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        // Link nodes
        head.next = node2;
        node2.next = node3;
        node3.next = node4;

        // No cycle case
        System.out.println("Cycle present? " + hasCycle(head));  // Output: false

        // Create a cycle: node4 points back to node2
        node4.next = node2;

        // Cycle case
        System.out.println("Cycle present? " + hasCycle(head));  // Output: true
    }
}
