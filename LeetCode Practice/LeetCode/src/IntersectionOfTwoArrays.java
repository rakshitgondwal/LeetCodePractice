

//I did this question using arraylist.
//Couldn't submit this question on leetcode because I haven't done
// Hashmaps or Hashsets whatever it is. So yeah.....


import java.util.ArrayList;

public class IntersectionOfTwoArrays{
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5,6};
        int[] nums2 = {4,6,2,3};
        System.out.println(intersection(nums1,nums2));
    }
    public static ArrayList intersection (int [] nums1 , int[] nums2){
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]){
                    list.add(nums1[i]);
                }
            }
        } return list;
    }
}
