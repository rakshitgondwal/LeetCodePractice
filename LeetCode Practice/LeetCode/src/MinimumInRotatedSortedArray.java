public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {11, 13, 15, 17};
        System.out.println(findMin(nums));
    }

    public static int findMin(int[] nums) {
      if (nums.length == 1){
            return nums[0];
        }
        int s = 0;
        int e = nums.length-1;

         if (nums[e] > nums[s]) {
            return nums[0];
        }

        while(s <= e){

            int mid = s + (e-s)/2;

            if (nums[mid] > nums[mid+1]){
                return nums[mid+1];
            }
            if ( nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }
            if (nums[mid] > nums[s]){
                s = mid +1;
            } else e = mid -1;


        } return -1;
    }

 /*
        if (nums.length == 1) {
            return nums[0];
        }
        int left = 0, right = nums.length - 1;
        if (nums[right] > nums[0]) {
            return nums[0];
        }
        while (right >= left) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }
            if (nums[mid - 1] > nums[mid]) {
                return nums[mid];
            }
            if (nums[mid] > nums[0]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }*/
}

