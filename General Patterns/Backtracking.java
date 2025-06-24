// Base Case -> Success or Failures
// Loop all ele
// If (condition to backtrack)
// Choose -> Add current candidate
// Explore -> Recursively call backtrack
// Unchoose

import java.util.ArrayList;
import java.util.List;

public class Backtracking {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        backtrack(output, new ArrayList<Integer>(), nums);
        return output;
    }

    private void backtrack(List<List<Integer>> output, List<Integer> current, int[] nums) {
        // Add 'current' to 'output' under backtracking end conditions
        if (current.size() == nums.length) {
            output.add(new ArrayList<Integer>(current));
            return;
        }
        // Loop for backtracking
        for (int ele : nums) {
            // Condition to backtrack
            if (!current.contains(ele)) {
                current.add(ele);
                backtrack(output, current, nums);
                current.remove(current.size() - 1);
            }
        }
    }
}
