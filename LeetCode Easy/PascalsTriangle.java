import java.util.*;
/*
 * https://leetcode.com/problems/pascals-triangle
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 */
public class PascalsTriangle
{
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        if (numRows <= 0) // Return empty List if numRows is 0
        {
            return output;   
        }
        List<Integer> prev = new ArrayList<Integer>();
        prev.add(1); // First row will have one element only
        output.add(prev); // Add the first row to our output
        for (int i = 2 ; i <= numRows ; i++) 
        {
            ArrayList<Integer> curr = new ArrayList<Integer>(); // Initialize a new current row
            curr.add(1); // Add the first element
            for (int j = 0 ; j < prev.size() - 1 ; j++) 
            {
                curr.add(prev.get(j) + prev.get(j + 1)); // current[index] = previous[index] + previous[index + 1]
            }
            curr.add(1); // Add the last element
            output.add(curr); // Add the current row to the output
            prev = new ArrayList<>(curr); // Intialize the previous row as current row
        }
        return output;
    }
}
