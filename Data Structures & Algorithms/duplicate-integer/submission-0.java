class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> numSets = new HashSet<>();

        for (int i =0; i< nums.length; i++) {

            if (!numSets.add(nums[i])) return true;
        }
        return false;
        
    }
}