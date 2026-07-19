class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;
        Map<Character, Integer> firstStringFrequency = new HashMap<>();
        Map<Character, Integer> secondStringFrequency = new HashMap<>();

        for (char c : s.toCharArray()) {

            firstStringFrequency.put(c, firstStringFrequency.getOrDefault(c,0) +1);
        }

        for (char c : t.toCharArray()) {

            secondStringFrequency.put(c, secondStringFrequency.getOrDefault(c,0) +1);
        }

        for (Map.Entry<Character, Integer> entry : firstStringFrequency.entrySet()) {

            char key = entry.getKey();
            if (!firstStringFrequency.get(key).equals(secondStringFrequency.getOrDefault(key, 0))){

                return false;
            }
        }
        return true;
    }
}
