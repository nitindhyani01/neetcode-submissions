class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;
        int i = 0;
        int len = heights.length;
        int[] exp = heights.clone();
        Arrays.sort(exp);
        while (i != len) {
            if (heights[i] != exp[i]) {
                count++;
            }
            i++;
        }
        return count;
    }
}