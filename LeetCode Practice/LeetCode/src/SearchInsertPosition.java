public class SearchInsertPosition {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,6,7};
        int target = 3;
        int ans = search(arr, target);
        System.out.println(ans);
    }
    public static int search (int [] arr , int target){
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e-s)/2;

            if (arr[mid] > target) {
                e = mid -1;
            }
            else if (arr[mid] < target){
                s = mid + 1;
            }
            else
                return mid;
        }
        return s;
    }
}



