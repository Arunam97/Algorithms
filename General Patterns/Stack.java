// Initialize the stack
// Loop through each element
// while (stack is not empty && other success conditions)
// stack.pop() and do operation
// Close while
// Push new element to stack.

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int currDay = 0; currDay < n; currDay++) {
            int currentTemp = temperatures[currDay];
            // Pop until the current day's temperature is not
            // warmer than the temperature at the top of the stack
            while (!stack.isEmpty() && temperatures[stack.peek()] < currentTemp) {
                int prevDay = stack.pop();
                answer[prevDay] = currDay - prevDay;
            }
            stack.push(currDay);
        }

        return answer;
    }
}
