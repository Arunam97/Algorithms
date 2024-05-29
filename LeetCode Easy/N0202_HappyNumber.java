/*
 * https://leetcode.com/problems/happy-number/
 * 
 * Write an algorithm to determine if a number n is happy.
 * A happy number is a number defined by the following process:
 * Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy.
 * Return true if n is a happy number, and false if not.
 */

import java.util.*;
public class N0202_HappyNumber
{
    /*
     * One important property of a number is that when you calculate its Happy number then the outcome can either be:
     * 1.) 1 - This means the number is happy number.
     * 2.) Infinite Loop - The number does not reach 1 but starts cycling through a specific set of numbers.
     * When calculating a happy number it cannot go infinetly up 
     * as the sum of squares of any number larger than 4 digits will reduce it down to 4 digits or less.
     */
    public boolean isHappy(int n) 
    {
        Set<Integer> set = new HashSet<Integer>();
        while (!set.contains(n)) // Check if the number is already in the set.
        {
            set.add(n);
            n = getNext(n);
            if (n == 1)
            {
                return true;
            }
        }
        return false;
    }

    // Function to generate the next number.
    public int getNext(int n)
    {
        int sum = 0;
        while (n > 0)
        {
            int p = n % 10;
            n = n / 10;
            sum = sum + (p * p);
        }
        return sum;
    }
}
