class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        char[] last = words[words.length-1].toCharArray();
        int count = last.length;
        return count;
    }
}