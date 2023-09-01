/*
 * https://leetcode.com/problems/valid-palindrome/
 * 
 * Given a string s, return true if it is a palindrome, or false otherwise.
 */
public class ValidPalindrome
{
    public boolean isPalindrome(String s) 
    {
        for (int left = 0 , right = s.length() - 1 ; left < right ; left++ , right--)
        {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) // Move left index up if its not a number or letter.
            {
                left = left + 1;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) // Move right index down if it is not letter or number.
            {
                right = right - 1;
            }
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if (!(Character.toLowerCase(leftChar) == Character.toLowerCase(rightChar))) // Turn characters lower case and compare.
            {
                return false;
            }
        }
        return true;
    }
}
