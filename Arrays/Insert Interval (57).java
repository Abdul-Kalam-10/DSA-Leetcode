class Solution {
    public int[][] insert(int[][] intervals, int[] newIntervals) {
        List<int[]> res = new ArrayList<>();

        int curr =0;
        while(curr < intervals.length && intervals[curr][1] < newIntervals[0])
        {
            res.add(intervals[curr++]);
        }
        while(curr < intervals.length && intervals[curr][0] <= newIntervals[1])
        {
            newIntervals[0] = Math.min(newIntervals[0],intervals[curr][0]);
            newIntervals[1] = Math.max(newIntervals[1],intervals[curr][1]);
            curr++;
        }
        res.add(newIntervals);
        while(curr < intervals.length)
        {
            res.add(intervals[curr++]);
        }
        return res.toArray(new int[res.size()][]);
    }
}