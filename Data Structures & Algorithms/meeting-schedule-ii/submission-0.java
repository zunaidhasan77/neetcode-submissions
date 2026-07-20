/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int[] startTimes = new int[intervals.size()];
        int[] endTimes = new int[intervals.size()];

        for(int i=0; i< intervals.size(); i++) {
            startTimes[i] = intervals.get(i).start;
            endTimes[i] = intervals.get(i).end;
        }
        Arrays.sort(startTimes);
        Arrays.sort(endTimes);

        int rooms =0;
        int endPointers =0;

        for (int startPointer =0; startPointer< startTimes.length; startPointer++){
            if(startTimes[startPointer] < endTimes[endPointers]) {
                rooms++;
            }

            else{
                endPointers++;
            }
        }
        return rooms;

    }
}
