/*
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 * Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. 
 * If the two linked lists have no intersection at all, return null.
 */
import java.util.*;
public class IntersectionOfTwoLinkedLists
{
    // ListNode class given as part of the question
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    /*
     * The intuition for this problem is that the intersection node has to be one of the nodes of the shorter list or else there is no intersection
     * Therefore we will first count the length of both lists, then start checking if the nth last element of each list is same or different
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        ListNode aPointer = headA;
        ListNode bPointer = headB;
        int lenA = 0; // Length of headA
        int lenB = 0; // Length of headB
        while (aPointer != null)
        {
            aPointer = aPointer.next;
            lenA = lenA + 1;
        }
        while (bPointer != null)
        {
            bPointer = bPointer.next;
            lenB = lenB + 1;
        }
        if (lenA >= lenB)
        {
            return helper(headA, headB, lenA - lenB);
        }
        else
        {
            return helper(headB, headA, lenB - lenA);
        }
    }
    public ListNode helper(ListNode longerHead, ListNode shorterHead, int difference)
    {
        while (difference > 0) // Go to the starting position for longerList
        {
            longerHead = longerHead.next;
            difference = difference - 1;
        }
        while (longerHead != null) // This if statement will also make sure that shorterHead is not null as both of them have same number of nodes after them.
        {
            if (longerHead == shorterHead)
            {
                return longerHead;
            }
            else 
            {
            longerHead = longerHead.next;
            shorterHead = shorterHead.next;                
            }
        }
        return null;
    }
}
