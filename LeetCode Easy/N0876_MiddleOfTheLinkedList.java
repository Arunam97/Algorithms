/*
 * https://leetcode.com/problems/middle-of-the-linked-list/
 * 
 * Given the head of a singly linked list, return the middle node of the linked list.
 * If there are two middle nodes, return the second middle node.
 */

public class N0876_MiddleOfTheLinkedList
{
    // Class ListNode given as part of the question
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}

        ListNode(int val) { this.val = val; }

        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // We will solve this problem using a fast and slow pointer approach.
    public ListNode middleNode(ListNode head) 
    {
        // If only 1 node is present then return the head.
        if (head.next == null)
        {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        // Keep moving forward until the fast pointer is near the end.
        while (fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        // If there are odd number of nodes then fast will point to the last Node.
        // Check if fast is in the last position and if so return the slow node.
        if (fast.next == null)
        {
            return slow;
        }
        // If there are even number of nodes then fast will point to the second last Node.
        // Check if fast is in the second last position and if so then return the node after slow.
        else
        {
            return slow.next;
        }
    }
}
