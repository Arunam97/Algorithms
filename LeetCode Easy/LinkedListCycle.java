/*
 * https://leetcode.com/problems/linked-list-cycle/
 * 
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 */
public class LinkedListCycle
{
    // Class ListNode given as part of the question.
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    
    // We will solve this using a fast a slow pointer approach. 
    // We can also simply store all the nodes in a HashSet to solve this problem but this solution uses constant space and is better.
    public boolean hasCycle(ListNode head) 
    {
        if (head == null)
        {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null)
        {
            if (slow == fast)
            {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
