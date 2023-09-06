/*
 * https://leetcode.com/problems/meeting-rooms-ii/
 * 
 * Given an array of meeting time intervals intervals where intervals[i] = [starti, endi],
 * return the minimum number of conference rooms required.
 */
import java.util.*;
public class N0253_MeetingRooms2
{
    public int minMeetingRooms(int[][] intervals) 
    {
        int totalMeetings = intervals.length;
        // We will be separating the starting and ending times.
        int[] startTimes = new int[totalMeetings];
        int[] endTimes = new int[totalMeetings];
        int maxRooms = 0;
        for (int i = 0 ; i < totalMeetings ; i++)
        {
            startTimes[i] = intervals[i][0];
            endTimes[i] = intervals[i][1];
        }
        /*
         * Sort ending and starting times.
         * This will mix up the meeting times but thats ok 
         * as our solution does not depend on us knowing when each meeting starts and ends, 
         * only the general starting and ending times of all meetings.
         */
        Arrays.sort(startTimes);
        Arrays.sort(endTimes);
        int startPointer = 0; // To track which starting time we are comparing to ending time.
        int endPointer = 0; // To track which ending time is to be compared to starting time.
        for (startPointer = 0 ; startPointer < totalMeetings ; startPointer++)
        {
            if (startTimes[startPointer] < endTimes[endPointer]) // If startTime is less than endTime that means we need a new meeting room.
            {
                maxRooms = maxRooms + 1;
            }
            else // Else we can simply use the meeting room vacated by the endTime and move to the next endTime.
            {
                endPointer = endPointer + 1;
            }
        }
        return maxRooms;
    }
}
