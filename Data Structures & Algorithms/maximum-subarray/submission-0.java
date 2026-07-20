class Solution {
    public int maxSubArray(int[] nums) {

        int maximumSum = Integer.MIN_VALUE;

        int currentSum =0;

        for(int num : nums) {
            currentSum+= num;
            maximumSum = Math.max(currentSum, maximumSum);
            if (currentSum <0) currentSum =0;
        }
        



        return maximumSum;
    }
}
