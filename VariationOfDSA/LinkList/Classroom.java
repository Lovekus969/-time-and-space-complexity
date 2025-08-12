public class Classroom {

    // Node class
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // LinkedList class
    static class LinkedList {
        Node head;
        Node tail;

        // 1. Add at the beginning
        public void addFirst(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // 2. Add at the end
        public void addLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // 3. Delete first element
        public void deleteFirst() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            head = head.next;
            if (head == null) {
                tail = null;
            }
        }

        // 4. Delete last element
        public void deleteLast() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            if (head.next == null) {
                head = tail = null;
                return;
            }
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }

        // 5. Search element
        public boolean search(int key) {
            Node temp = head;
            while (temp != null) {
                if (temp.data == key) {
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }

        // 6. Print list
        public void printList() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        // 7. Reverse list (iterative)
        public void reverse() {
            Node prev = null;
            Node current = head;
            Node nextNode;

            while (current != null) {
                nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
            }
            head = prev;
        }
    }

    // Main method to test
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add elements
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.addLast(40);
        list.printList(); // 20 -> 10 -> 30 -> 40 -> null

        // Delete operations
        list.deleteFirst();
        list.printList(); // 10 -> 30 -> 40 -> null
        list.deleteLast();
        list.printList(); // 10 -> 30 -> null

        // Search
        System.out.println("Search 30: " + list.search(30)); // true
        System.out.println("Search 50: " + list.search(50)); // false

        // Reverse
        list.reverse();
        list.printList(); // 30 -> 10 -> null
    }
}
