/*
* https://leetcode.com/problems/merge-strings-alternately/
*
* You are given two strings word1 and word2.
* Merge the strings by adding letters in alternating order, starting with word1.
* If a string is longer than the other, append the additional letters onto the end of the merged string.
* Return the merged string.
*
* Solution: Two Pointer.
 */

public class N1768_MergeStringsAlternatively {
    public String mergeAlternately(String word1, String word2) {
        if (word1 == null || word1.length() == 0) {
            return word2;
        }
        if (word2 == null || word2.length() == 0) {
            return word1;
        }

        String mergedString = "";
        int word1Index = 0;
        int word2Index = 0;

        int word1Len = word1.length();
        int word2Len = word2.length();

        while (word1Index < word1Len && word2Index < word2Len) {
            mergedString = mergedString + word1.charAt(word1Index) + word2.charAt(word2Index);
            word1Index++;
            word2Index++;
        }

        if (word1Index == word1Len) {
            mergedString = mergedString + word2.substring(word2Index);
        }
        if (word2Index == word2Len) {
            mergedString = mergedString + word1.substring(word1Index);
        }
        return mergedString;
    }
}
