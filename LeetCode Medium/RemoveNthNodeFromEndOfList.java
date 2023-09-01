/*
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 * 
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 */
public class RemoveNthNodeFromEndOfList
{
    // Class ListNode given as part of the question
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}

        ListNode(int val) { this.val = val; }

        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        ListNode dummy = new ListNode(); // A new dummy node to be attached at the front of the list (before head) to manage edge cases.
        dummy.next = head;
        int len = 0;
        ListNode pointer = head; // We won't be manipulating head as we have to return it at the end.
        while (pointer != null)
        {
            len = len + 1; // Calculating the length of the list.
            pointer = pointer.next;
        }
        int diff = len - n;
        pointer = dummy; // Start at the dummy node,
        while (diff > 0)
        {
            diff = diff - 1;
            pointer = pointer.next; // And keeping going next until we reach the node right before the one we have to remove.
        }
        pointer.next = pointer.next.next;
        return dummy.next;
    }
}