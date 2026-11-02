class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder(s.length() + spaces.length);
        int spaceIdx = 0;
        int m = spaces.length;

        for (int i = 0; i < s.length(); i++) {
            if (spaceIdx < m && i == spaces[spaceIdx]) {
                sb.append(' ');
                spaceIdx++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}