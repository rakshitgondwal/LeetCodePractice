public class RotationCountInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8,1,2};
        System.out.println(rotaionCount(arr));
    }
      public static int rotaionCount(int[] arr){
            if (findPivot(arr) != -1){
                return findPivot(arr) + 1;
            }
            return -1;
       }
    public static int findPivot(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[s] > arr[mid]) {
                e = mid - 1;
            } else s = mid + 1;
        } return -1;
    }
}
