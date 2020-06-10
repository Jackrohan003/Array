class Solution {
    public int searchInsert(int[] nums, int target) {
        int position = Arrays.binarySearch(nums, target);
        return position >= 0 ? position : ~position;
    }
}
