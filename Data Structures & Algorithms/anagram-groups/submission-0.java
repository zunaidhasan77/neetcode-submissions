class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length ==0) return null;

        Map<String, List<String>> groupMap = new HashMap<>();

        for (String str : strs) {

            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            groupMap.putIfAbsent(key, new ArrayList<>());

            groupMap.get(key).add(str);
         }
        return groupMap.values().stream().toList();
    }
}
