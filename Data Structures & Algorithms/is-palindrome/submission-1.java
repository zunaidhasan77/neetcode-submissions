class Solution {
    public boolean isPalindrome(String s) {
        
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start =0;
        int end = cleanedString.length() -1;

        while (start<end) {

            if (cleanedString.charAt(start)!= cleanedString.charAt(end)) return false;

            start++;
            end--;
        }

        return true;
    }
}
