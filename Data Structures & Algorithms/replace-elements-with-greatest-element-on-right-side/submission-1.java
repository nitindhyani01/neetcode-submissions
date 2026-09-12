class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length-1;
        int maxRight = -1;
        for(int i = len; i >= 0;i--)
        {
            int current = arr[i];
            arr[i] = maxRight;
            maxRight = Math.max(maxRight, current);
        }
        return arr;
    }
}