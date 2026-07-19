class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> numSet = new HashSet<>();

        int longest =0;

        for (int i =0; i< nums.length; i++) {

            numSet.add(nums[i]);
        }

        for (int num : nums) {
            int length =1;
            if (!numSet.contains(num-1)){

                while (numSet.contains(num + length)){

                    length++;

                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
        
    }
}
