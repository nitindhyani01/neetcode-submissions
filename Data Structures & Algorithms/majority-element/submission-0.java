class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int MajEle = 0;

        for (int num : nums) {
            if (count == 0) {
                MajEle = num;
            }
            if (num == MajEle) {
                count++;
            } else {
                count--;
            }
        }
        return MajEle;
    }
}