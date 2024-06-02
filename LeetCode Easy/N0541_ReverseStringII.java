/*
* https://leetcode.com/problems/reverse-string-ii/
*
* Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.
* Note: This problem can be rephrased as " For every group of 2k characters, reverse the first k characters."
* If there are fewer than k characters left, reverse all of them.
* If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.
*
* Solution: Two Pointer.
*/
public class N0541_ReverseStringII {
    public String reverseStr(String s, int k) {
        // Null and empty string check
        if (s == null || s.isEmpty()) {
            return "";
        }

        // Convert string to char array
        char[] sArray = s.toCharArray();
        int sArrayIndex = 0;

        // Run the loop while the index is less than the length of the array
        while(sArrayIndex < sArray.length) {
            swap(sArray, sArrayIndex, sArrayIndex + k - 1);
            // Move the index by 2k
            // Increasing the index by 2k will take us to the next group of 2k characters
            // and if there are less than 2k characters left, the loop will exit
            sArrayIndex = sArrayIndex + 2 * k;
        }
        // Convert char array to string
        return String.valueOf(sArray);
    }

    // Helper method to swap characters in a char array
    public void swap(char[] sArray, int left, int right) {
        // If right index is greater than the length of the array, set it to the last index
        if(right >= sArray.length) {
            right = sArray.length - 1;
        }
        // Swap characters
        while (left < right && left < sArray.length && right < sArray.length) {
            char temp = sArray[left];
            sArray[left] = sArray[right];
            sArray[right] = temp;
            left++;
            right--;
        }
    }
}
