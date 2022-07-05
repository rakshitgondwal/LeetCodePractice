public class SetMismatch {
    public static void main(String[] args) {
    int [] nums = {1,2,2,4};
        System.out.println(findErrorNums(nums));
    }
    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if ( nums[i] != nums[correct]){
                swap(nums,i,correct);
            } else i++;
        }

        int [] ansArr = new int[2];
        for (int index = 0; index < nums.length ; index++) {
            if ( nums[index] != index +1){
                ansArr[0] = nums[index];
                ansArr[1] = index + 1;
            }
        } return ansArr;

    }
    public static void swap(int [] nums, int first , int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
