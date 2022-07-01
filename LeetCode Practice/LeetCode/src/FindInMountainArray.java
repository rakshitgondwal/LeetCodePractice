public class FindInMountainArray {
    public static void main(String[] args) {
         int[] arr = {1,2,3,4,5,3,1};
         int target = 3;
        System.out.println(findInArray(arr,target));
    }
    public static int findInArray(int [] arr, int target){
        if ( incr(arr, target) == -1){
            return desc(arr,target);
        }else return incr(arr,target);
    }

    public static int incr(int [] arr, int target) {
        int s= 0;
        int e = findPeak(arr);
        while (s < e){
            int mid = s + (e-s)/2;

            if (target < arr[mid]){
                e = mid-1;
            } else if (target > arr[mid]) {
                s = mid +1;
            } else return mid;
        } return -1;

    }


    public static int desc(int [] arr, int target) {
        int s = findPeak(arr);
        int e = arr.length-1;
        while (s < e) {
            int mid = s + (e - s) / 2;

            if (target < arr[mid]) {
                e = mid - 1;
            } else if (target > arr[mid]) {
                s = mid + 1;
            } else return mid;
        }
        return -1;

    }


    public static int findPeak(int [] arr){
        int s = 0;
        int e = arr.length-1;

        while(s< e){
            int mid = s + (e-s)/2;

            if (arr[mid] < arr[mid +1]){
                s = mid +1;
            } else e = mid;
        } return s;
    }





}