package Challenges.FirstAndLastPosInSortedArray;

public class FirstAndLastPosInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int ans = binarySearch(nums, target, 0, nums.length - 1, true);
        int ans2 = binarySearch(nums, target, 0, nums.length - 1, false);

        return new int[] {ans, ans2};
    }

    public int binarySearch(int[] nums, int target, int start, int end, boolean first){
        int temp = -1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(target > nums[mid]){
                start = mid + 1;
            } else if(target < nums[mid]) {
                end = mid - 1;
            } else {
                temp = mid;
                if(first){
                    end = mid-1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return temp;
    }
}
