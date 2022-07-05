public class FirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
     int[] nums = {1,2,3,4,4,4,4,5,6};
     int target = 4;
        System.out.println(searchRange(nums,target));
    }
    public static int[] searchRange(int [] nums , int target){
        int[] ans = new int[2];
        ans[0]= findFirstOccurrence(nums,target);
        ans[1]= findLastOccurrence(nums,target);

        return ans;
    }
    private static int findFirstOccurrence(int[] nums, int target) {
        // Left and right pointers
        int left = 0;
        int right = nums.length - 1;

        int firstOccurrence = -1;

        while (left <= right) {

            int middle = left + (right - left) / 2;

            if (nums[middle] == target) {
                firstOccurrence = middle;
                right = middle - 1;
            }

            else if (target < nums[middle]) {
                right = middle - 1;
            }

            else {
                left = middle + 1;
            }
        }
        return firstOccurrence;
    }

    private static int findLastOccurrence(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        int lastOccurrence = -1;

        while (left <= right) {

            int middle = left + (right - left) / 2;

            if (nums[middle] == target) {
                lastOccurrence = middle;
                left = middle + 1;
            }

            else if (target < nums[middle]) {
                right = middle - 1;
            }
            else {
                left = middle + 1;
            }
        }
        return lastOccurrence;
    }
    }

