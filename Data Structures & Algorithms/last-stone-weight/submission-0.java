class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int stone : stones) {
            minHeap.offer(-stone);
        }

        while (minHeap.size() >1) {
            int heaviest = minHeap.poll();
            int secondHeaviest = minHeap.poll();

            if (secondHeaviest > heaviest) {
                minHeap.offer(heaviest - secondHeaviest);
            }
        }

        minHeap.offer(0);

        return Math.abs(minHeap.peek());
        
    }
}
