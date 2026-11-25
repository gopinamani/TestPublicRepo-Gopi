public class LinkedListExample {
    // A node stores a value and a reference to the next node.
    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        // Create a linked list: 10 -> 20 -> 30
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        // Print the list
        for (Node current = head; current != null; current = current.next) {
            System.out.print(current.value);
            if (current.next != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }
}