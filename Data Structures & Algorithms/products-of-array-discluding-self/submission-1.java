class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;


        int[] suffix = new int[n];

        int [] result = new int[n];

        result[0] = 1;
        suffix[n-1] =1;

        for (int i =1; i<n; i++) {

            result[i] = nums[i-1] * result[i-1];
        }

        for (int i = n-2; i>=0; i--) {

            suffix[i] = nums[i+1]* suffix[i+1];

            result[i] = result[i] * suffix[i];
        }

        return result;
        
    }
}  
