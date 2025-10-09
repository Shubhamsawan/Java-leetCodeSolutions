package LeetCodeSlution;

public class AddTwoNumber {

//    You are given two non-empty linked lists representing two non-negative integers.
//    The digits are stored in reverse order, and each of their nodes contains a single digit.
//    Add the two numbers and return the sum as a linked list.
//    You may assume the two numbers do not contain any leading zero,
//    except the number 0 itself.


    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addRecursive(l1, l2, 0);
    }

    private static ListNode addRecursive(ListNode l1, ListNode l2, int carry) {
        // Base case: both lists empty and no carry left
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        int sum = carry;
        if (l1 != null) sum += l1.val;
        if (l2 != null) sum += l2.val;

        // Create a new node with current digit
        ListNode result = new ListNode(sum % 10);

        // Compute carry for next recursion
        int newCarry = sum / 10;

        // Move to next nodes
        ListNode next1 = (l1 != null) ? l1.next : null;
        ListNode next2 = (l2 != null) ? l2.next : null;

        // Recursive call
        result.next = addRecursive(next1, next2, newCarry);

        return result;
    }

    // Helper to print the linked list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) System.out.print(" -> ");
            node = node.next;
        }
        System.out.println();
    }

    // Example usage
    public static void main(String[] args) {
        // List 1: 2 -> 4 -> 3
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // List 2: 5 -> 6 -> 4
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = addTwoNumbers(l1, l2);

        System.out.print("Result: ");
        printList(result);
    }

}
