/*
 * https://leetcode.com/problems/flatten-2d-vector/
 * 
 * Design an iterator to flatten a 2D vector. It should support the next and hasNext operations.
 * Implement the Vector2D class:
 * Vector2D(int[][] vec) initializes the object with the 2D vector vec.
 * next() returns the next element from the 2D vector and moves the pointer one step forward. You may assume that all the calls to next are valid.
 * hasNext() returns true if there are still some elements in the vector, and false otherwise.
 */
public class Vector2D
{
    int [][] vector;
    int inner = 0;
    int outer = 0;
    public Vector2D(int[][] vec) 
    {
        vector = vec;
    }

    public int next() 
    {
        /*
         * Calling hasNext here serves 2 purposes:
         * It checks if there is a next element present or not,
         * and in the process it calls advance(), 
         * which places our inner and outer pointers at the beginning of the next array in case we are at the end.
         */
        if (!hasNext())
        {
            return 0;
        }
        else
        {
            return vector[outer][inner++];
        }
    }

    public boolean hasNext() 
    {
        advance(); // Go to next array in case we are at the end of the current one.
        return outer < vector.length;
    }

    // Go to the next array but only if we are at the last index of the current array.
    private void advance()
    {
        while (outer < vector.length && inner == vector[outer].length)
        {
            inner = 0;
            outer = outer + 1;
        }
    }
}
