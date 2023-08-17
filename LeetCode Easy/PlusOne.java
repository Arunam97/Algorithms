/*
 * https://leetcode.com/problems/plus-one
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
 * The digits are ordered from most significant to least significant in left-to-right order. 
 * The large integer does not contain any leading 0's.
 * Increment the large integer by one and return the resulting array of digits.
 */
public class PlusOne
{
    public int[] plusOne(int[] digits) 
    {
        for(int i = digits.length - 1 ; i >= 0; i--) // Accessing the array elements backwards
        { 
            if (digits[i] < 9) // If the last digit is not 9 then simple increase the last digit by 1 and return the array
            { 
                digits[i]++;
                return digits;
            }
            else // If the digit is 9 then change it to zero and run the loop again
            { 
                digits[i] = 0;
            }
        }
        // If the program gets to here then that means all the digits of the aray were 9 and have been turned to zero. [9,9] -> [0,0]
        digits = new int[digits.length + 1]; // Create a new array of size 'digits' + 1
        digits[0] = 1; // Change the first element to 1. The newly initialized array has all elements set to 0
        return digits;
    }
}
