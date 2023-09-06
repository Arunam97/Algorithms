/*
 * https://leetcode.com/problems/valid-sudoku/
 * 
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 */
import java.util.*;
public class N0036_ValidSudoku
{
    public boolean isValidSudoku(char[][] board) 
    {
        // Initialize a list of sets for rows, columns, and boxes.
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];
        // Initialize 9 sets within each list (corresponding to the 9 rows, columns and boxes).
        for (int i = 0 ; i < 9 ; i++)
        {
            rows[i] = new HashSet<Character>();
            cols[i] = new HashSet<Character>();
            boxes[i] = new HashSet<Character>();
        }
        for (int r = 0; r < 9 ; r++)
        {
            for (int c = 0; c < 9 ; c++)
            {
                int character = board[r][c];
                // If no number is present then continue.
                if (character == '.')
                {
                    continue;
                }
                // If number cannot be added to the set then that means the number is already present in that row.
                if (!rows[r].add((char) character))
                {
                    return false;
                }
                // If number cannot be added to the set then that means the number is already present in that column.
                if (!cols[c].add((char) character))
                {
                    return false;
                }
                // The boxes are counted row-wise i.e., top-left box is box 0, top-middle box is box 1, top-right box is box 2, middle-left box is box 3 etc.
                int box = ((r / 3) * 3) + (c / 3);
                // If number cannot be added to the set then that means the number is already present in that box.
                if (!boxes[box].add((char) character))
                {
                    return false;
                }
            }
        }
        return true; // Return true if all characters pass all checks
    }
}
