

//This is the solution for leetcode.

/*

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int end = n;
        while (left < end) {
            int mid = left + (end - left) / 2;
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
*/


//This is my brute force solution. I didn't understand the
// question at first, so did something else, but then did the
// right one above. ^^


public class FirstBadVersion {
    public static void main(String[] args) {
      int [] arr = {1,2,3,4,5,6,7,8};
      int bad = 5;
        System.out.println(isBadVersion(6,arr,bad));
    }
    public static boolean isBadVersion(int version, int [] arr, int bad){
       if (version < firstBadVersion(arr, bad)){
           return false;
       }
        if ( version > firstBadVersion(arr,bad)){
           return true;
        }
        if (version == firstBadVersion(arr,bad)){
            return true;
        }
        return false;
    }

    public static int firstBadVersion(int [] arr , int bad){
        int s = 0;
        int e = arr.length-1;

        while(s <= e){
            int mid = s + (e-s)/2;

            if (arr[mid] < bad){
                s = mid +1;
            }else if ( arr[mid] > bad){
                e = mid -1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
