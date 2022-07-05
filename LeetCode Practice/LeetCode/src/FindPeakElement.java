public class FindPeakElement {
    public static void main(String[] args) {
     int[] nums = {1,2,1,3,3,1,5,4};
        System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int [] nums){
   /*

    This was the solution that I wrote, Idk it is right, leetcode
    accepted it too but when i tried to submit it, it showed runtime error.
    Don't know why.




     int s = 0;
        int e = nums.length -1;

        while (s<= e){
            int mid = s + (e-s)/2;

            if (s == mid && nums[s] > nums[e] ){
                return s;
            }
            if (e == mid && nums[e] > nums[s] ){
                return e;
            }
            if (nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1] ){
                return mid;
            }else if ( nums[mid] > nums [mid -1] && nums[mid] < nums[mid +1]){
                s = mid +1;
            } else e = mid -1;
        } return -1;
    }*/



    // This is the leetcode's solution.
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[mid + 1])
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }
}
