class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        int left = 0, right = nums.length - 1;
        // First occurrence (left bound)
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) right = mid - 1; // shrink left side
            else left = mid + 1;
        }
        // check after loop
        if (left < nums.length && nums[left] == target) ans[0] = left;

        // Reset pointers
        left = 0; right = nums.length - 1;
        // Last occurrence (right bound)
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) left = mid + 1; // shrink right side
            else right = mid - 1;
        }
        if (right >= 0 && nums[right] == target) ans[1] = right;

        return ans;
    }
}
