import java.util.ArrayList;
import java.util.*;

public class FindAllDuplicates {
    public static void main(String[] args) {
      int [] nums = {1,1,3};
        System.out.println(findDuplicate(nums));
    }
    public static List<Integer> findDuplicate ( int[] nums){
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if ( nums[i] != nums[correct]){
                swap(nums,i,correct);
            } else i++;
        }

        List<Integer> ansList = new ArrayList<>();

        for (int index = 0; index < nums.length ; index++) {
            if ( nums[index] != index +1){
                ansList.add(nums[index]);
            }
        } return ansList;

    }
    public static void swap(int [] nums, int first , int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
