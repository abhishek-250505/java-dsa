public class InsertPosition {
    public static int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // target found
            if (nums[mid] == target) {
                return mid;
            }

            // move right
            else if (nums[mid] < target) {
                low = mid + 1;
            }

            // move left
            else {
                high = mid - 1;
            }
        }

        // insertion position
        return low;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 6};

        System.out.println(searchInsert(nums, 5));
        System.out.println(searchInsert(nums, 2));
        System.out.println(searchInsert(nums, 7));
    }
}
