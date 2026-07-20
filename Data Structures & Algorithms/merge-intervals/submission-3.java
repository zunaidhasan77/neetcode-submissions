class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparingInt(a->a[0]));

        List<int[]> results = new ArrayList<>();

        int[] currentInterval = intervals[0];

        results.add(currentInterval);

        for(int i=1; i< intervals.length; i++) {

            if(intervals[i][0] <= currentInterval[1]){
                currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);

            }

            else{
                currentInterval = intervals[i];
                results.add(currentInterval);
            }
        }

        return results.toArray(new int[results.size()][]);
        
    }
}
