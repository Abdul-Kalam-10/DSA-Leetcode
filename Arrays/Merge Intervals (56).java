class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);

        int index = 0;
        List<int[]> res = new ArrayList<>();

        while(index < intervals.length){

            int newstart = intervals[index][0];
            int currend = intervals[index][1];
        
            while(index < intervals.length-1 && currend >= intervals[index +1] [0]){
            currend = Math.max(currend, intervals[index +1] [1]);
            index = index + 1;
        }
            
            int newend =  currend;
            res.add(new int[]{newstart,newend});
            index = index + 1;
        }
        index = 0;
        int [][] result = new int [res.size()][2];

        for(int[] arr : res)
        {
            result[index++] = arr;
        }
        return result;

    }
}