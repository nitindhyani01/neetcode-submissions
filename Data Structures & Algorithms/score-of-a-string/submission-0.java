class Solution {
    public int scoreOfString(String s) {
        char[] s1 = s.toCharArray();
        int sum = 0;
        int diff = 0;
        for(int i = 0;i < s1.length-1; i++){
            diff = Math.abs((int)s1[i+1] - (int)s1[i]);
            sum = sum + diff;
        }
        return sum;
    }
}