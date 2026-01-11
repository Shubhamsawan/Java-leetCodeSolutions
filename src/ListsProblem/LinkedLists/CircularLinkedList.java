package ListsProblem.LinkedLists;

// Circular Linked List Example
class CircularLinkedList {

    // Node structure
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        // Creating nodes
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // Linking nodes
        head.next = second;
        second.next = third;
        third.next = head; // last node points to head

        // Traversing circular list
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }
}

