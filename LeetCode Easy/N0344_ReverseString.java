/*
 * https://leetcode.com/problems/reverse-string/
 * 
 * Write a function that reverses a string. The input string is given as an array of characters s.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Solution: Two Pointer.
 */

public class N0344_ReverseString
{
    public void reverseString(char[] s) 
    {
        int head = 0;
        int tail = s.length - 1;
        while(head < tail) {
            char temp = s[head];
            s[head] = s[tail];
            s[tail] = temp;
            head++;
            tail--;
        }
    }    
}
