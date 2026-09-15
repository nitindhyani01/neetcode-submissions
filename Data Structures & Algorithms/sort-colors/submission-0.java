class Solution {
    public void sortColors(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int start = 0;
            while (start < nums.length - 1 - i) {
                if (nums[start] > nums[start + 1]) {
                    swap(nums, start, start + 1);
                }
                start++;
            }
        }
    }

    private void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}