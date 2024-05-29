/*
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 * 
 * Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. 
 * If the two linked lists have no intersection at all, return null.
 *
 * Solution: Two pointer.
 */

import java.util.*;
public class N0160_IntersectionOfTwoLinkedLists
{
    // ListNode class given as part of the question
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    
    /*
     * The intuition for this problem is that the intersection node has to be one of the nodes of the shorter list or else there is no intersection.
     * Therefore, we will first count the length of both lists, then start checking if the nth last element of each list is same or different.
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // If either of the lists is null, then there is no intersection.
        if(headA == null || headB == null) {
            return null;
        }

        int lengthA = 0;
        int lengthB = 0;
        ListNode headACopy = headA;
        ListNode headBCopy = headB;

        // Count the length of both lists.
        while(headACopy != null) {
            lengthA++;
            headACopy = headACopy.next;
        }

        while(headBCopy != null) {
            lengthB++;
            headBCopy = headBCopy.next;
        }

        // Move the head of the longer list to the same position as the shorter list.
        if(lengthA > lengthB) {
            for(int i = 0; i < lengthA - lengthB; i++) {
                headA = headA.next;
            }
        }
        else if(lengthB > lengthA) {
            for(int i = 0; i < lengthB - lengthA; i++) {
                headB = headB.next;
            }
        }

        // Now, both lists are at the same position. We can start comparing the nodes.
        while(headA != null) {
            // If we find the intersection, return the node.
            if (headA == headB) {
                return headA;
            }
            // Move both pointers.
            headA = headA.next;
            headB = headB.next;
        }
        // If no intersection found, return null.
        return null;
    }
}
