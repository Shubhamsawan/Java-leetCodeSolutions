package ListsProblem.LinkedLists;

// Doubly Linked List Example
class DoublyLinkedList {

    // Node structure
    static class Node {
        int data;
        Node prev;  // points to previous node
        Node next;  // points to next node

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        // Creating nodes
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // Linking nodes
        first.next = second;      //first.next: 20
        second.prev = first;      //second.prev :10

        second.next = third;      //second.next :30
        third.prev = second;      //third.prev : 20

        // Forward traversal
        System.out.println("first.next: " + first.next.data + " second.next :" + second.next.data);
        System.out.println("third.prev : " + third.prev.data + " second.prev :" + second.prev.data);
        System.out.print("Forward: ");
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        // Backward traversal
        System.out.print("\nBackward: ");
        temp = third;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }
}

