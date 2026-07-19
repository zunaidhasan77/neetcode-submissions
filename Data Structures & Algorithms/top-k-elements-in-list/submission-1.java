class Solution {
    public int[] topKFrequent(int[] nums, int k) {
                Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> frequencyList = new ArrayList<>(frequencyMap.entrySet());

        frequencyList.sort((a,b)->Integer.compare(b.getValue(), a.getValue()));

        int[] result = new int[k];

        for(int i =0; i<k; i++) {
            result[i] = frequencyList.get(i).getKey();

        }
        return result;
        
    }
}
