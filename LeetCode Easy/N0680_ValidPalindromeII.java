/*
* https://leetcode.com/problems/valid-palindrome-ii/
*
* Given a string s, return true if the s can be palindrome after deleting at most one character from it.
*
 * Solution: Two Pointer. One important thing to note is that when we encounter a mismatched character we must check if the string is palindrome by removing the character at the left index OR the right index.
 * Arbitrarily removing the character at the left index or the right index will not work.
 */

public class N0680_ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            // Once we encounter a mismatched character, we must check if the string is palindrome by removing the character at the left index OR the right index. Checking only one side will not work.
            if (s.charAt(i) != s.charAt(j)) {
                // If we get to this point, it means that we have encountered a mismatched character. Going into checkPalindrome will ensure we only skip once.
                return (checkPalindrome(s, i, j - 1) || checkPalindrome(s, i + 1, j));
            }
            i++;
            j--;
        }
        return true;
    }

    // A very simple helper method to check if a string is palindrome
    private boolean checkPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
