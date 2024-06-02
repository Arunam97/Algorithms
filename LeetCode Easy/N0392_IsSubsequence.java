/*
* https://leetcode.com/problems/is-subsequence/
*
* Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
* A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters.
* (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
*
* Solution: Two Pointer.
*/

public class N0392_IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        // Edge cases
        if (s == null || s.isEmpty()) {
            return true;
        }

        if (t == null || t.isEmpty()) {
            return false;
        }

        // Index for s
        int sIndex = 0;

        // Loop through t
        for (int tIndex = 0; tIndex < t.length(); tIndex++) {
            // If characters match, increment sIndex
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
            // If sIndex reaches end, return true
            if (sIndex == s.length()) {
                return true;
            }
        }
        // If sIndex does not reach end, return false
        return false;
    }
}
