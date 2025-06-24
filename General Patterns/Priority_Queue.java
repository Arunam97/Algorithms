import java.util.PriorityQueue;

// Create priority queue
// Add first element if needed.
// Loop through the array
// If condition to add to PQ. Then inner if ti check if PQ is still valid (size, etc.)

public class Priority_Queue {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);
        pq.offer(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > pq.peek() || pq.size() < k) {
                pq.offer(nums[i]);
                if (pq.size() > k) {
                    pq.poll();
                }
            }
        }
        return pq.poll();
    }
}
