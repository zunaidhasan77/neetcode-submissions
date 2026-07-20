class Solution {
    public int leastInterval(char[] tasks, int n) {

        int[] count = new int[26];

        for(char c : tasks){

            count[c -'A']++;
        }

        Arrays.sort(count);
        int maxFrequency = count[25];
        int idle = (maxFrequency -1)*n;

        for (int i=24; i>=0; i--){
            idle = idle - Math.min(maxFrequency - 1, count[i]);


        }
        return Math.max(0, idle) + tasks.length;        
    }
}
