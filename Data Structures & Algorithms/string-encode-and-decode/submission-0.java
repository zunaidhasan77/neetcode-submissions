class Solution {
    public String encode(List<String> strs) {
        final String specialCharacter = "*";

        StringBuilder encodedStringBuilder = new StringBuilder();

        for (String string : strs) {
            int length = string.length();

            encodedStringBuilder.append(length).append(specialCharacter).append(string);
        }
        return encodedStringBuilder.toString();
    }

    public List<String> decode(String str) {
        List<String> resultString = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {
            int delimiterIndex = str.indexOf('*', i);

            int length = Integer.parseInt(str.substring(i, delimiterIndex));

            int stringStart = delimiterIndex + 1;

            int stringEnd = stringStart + length;

            resultString.add(str.substring(stringStart, stringEnd));

            i = stringEnd;
        }
        return resultString;
    }
}
