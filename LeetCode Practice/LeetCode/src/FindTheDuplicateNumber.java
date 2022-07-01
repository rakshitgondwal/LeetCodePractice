public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(nums));
    }

    //This is not the correct ans.
    //Will return to this question when I will be practing some
    //other data structure.
    //I tried to solve it using liner search here but
    //linear search takes O(n^2) time complexity.
    //thus it just a brute force solution.

    public static int findDuplicate(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while(start < end){

            for (int i = 0; i < nums.length-1; i++) {
                for (int j = i+1; j < nums.length-1; j++) {

                    if( nums[i] == nums[j]){
                           return nums[j];
                    }

                }
            }
        } return  -1;
    }
}
