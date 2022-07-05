public class SingleElementInASortedArray {
    public static void main(String[] args) {
        int[] arr = {3,3,7,7,10,11,11};
        System.out.println(binarySearch(arr));
       }
        public static int binarySearch ( int[] nums){

        int s = 0;
         int e = nums.length-1;

         if ((nums.length)%2 == 0){
             return -1;
         }

           while(s<e){

               int mid = s + (e-s)/2;

               if (nums[mid] != nums[mid +1] && nums[mid] != nums[mid -1]){
                   return nums[mid];
               }

               if (nums[mid] == nums[mid -1] && nums[mid] != nums[mid +1]){
                   if( (mid + 1)%2 == 0){
                       s = mid +1;
                   } else e = mid;
               }

               if (nums[mid] == nums[mid + 1] && nums[mid] != nums[mid - 1] ){
                   if ( mid % 2 == 0){
                       s = mid;
                   } else e = mid -1;
               }


           } return nums[e];
        }
    }

