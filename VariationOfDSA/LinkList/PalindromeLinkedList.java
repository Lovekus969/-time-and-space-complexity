public class PalindromeLinkedList {
    
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Add node to the end
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Check if list is palindrome
    public boolean isPalindrome() {
        if (head == null || head.next == null) return true;

        // Step 1: Find the middle (slow/fast pointers)
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half
        Node secondHalf = reverseList(slow);

        // Step 3: Compare both halves
        Node firstHalf = head;
        Node tempSecond = secondHalf;
        boolean isPalin = true;
        while (tempSecond != null) {
            if (firstHalf.data != tempSecond.data) {
                isPalin = false;
                break;
            }
            firstHalf = firstHalf.next;
            tempSecond = tempSecond.next;
        }

        // Step 4 (optional): Restore list (reverse again)
        reverseList(secondHalf);

        return isPalin;
    }

    // Reverse a linked list
    private Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node nextNode;
        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    // Print the list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        PalindromeLinkedList list = new PalindromeLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);

        list.printList();
        
        if (list.isPalindrome()) {
            System.out.println("✅ The linked list is a palindrome.");
        } else {
            System.out.println("❌ The linked list is NOT a palindrome.");
        }
    }
}
