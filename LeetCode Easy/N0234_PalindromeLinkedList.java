/*
 * https://leetcode.com/problems/palindrome-linked-list/
 * 
 * Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
 */
import java.util.*;
public class N0234_PalindromeLinkedList
{
    // Class ListNode given as part of the question.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}

        ListNode(int val) { this.val = val; }

        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public boolean isPalindrome(ListNode head) 
    {
        List<Integer> list = new ArrayList<Integer>();
        while (head != null) // Add the LinkedList to a new ArrayList.
        {
            list.add(head.val);
            head = head.next;
        }
        for (int i = 0 ; i < list.size() / 2 ; i++) // Use a 2 pointer system to check if the list is a palindrome or not.
        {
            if (list.get(i) != list.get(list.size() - 1 - i))
            {
                return false;
            }
        }
        return true;
    }
}
