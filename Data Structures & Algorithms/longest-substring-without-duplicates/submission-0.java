class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left =0;
        int right = 0;
        int maxLength =0;

        Set<Character> windowFrame = new HashSet<>();

        while (right <s.length()) {

            

            if (!windowFrame.contains(s.charAt(right))){

                windowFrame.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left +1);
                right++;



            }

            else{
                windowFrame.remove(s.charAt(left));
                left++;
            }


        }
        return maxLength;
        
    }
}
