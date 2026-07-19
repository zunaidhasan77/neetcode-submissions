class Solution {
    public int[][] merge(int[][] intervals) {

        if (intervals == null || intervals.length <=1) return intervals;

        Arrays.sort(intervals, Comparator.comparingInt(a->a[0]));
        List<int[]> results = new ArrayList<>();
        int[] currentInterval = intervals[0];
        results.add(currentInterval);

        for(int i =1; i< intervals.length;i++){

            if(currentInterval[1] < intervals[i][0]){

                currentInterval = intervals[i];
                results.add(currentInterval);
            }
            else{

                currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
            }
        }

        return results.toArray(new int[results.size()][]);
        
    }
}
