public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = { 3,0,1};
        System.out.println(MissingNum(nums));

    }
    //The length of the array is n-1. So, the sum of all n
    // elements i.e. sum of numbers from 1 to n can be
    // calculated using the formula n*(n+1)/2. Now find the sum of all the elements in
    // the array and subtract it from the sum of the first n natural numbers,
    // it will give us the value of the missing element.


    public static int MissingNum(int [] nums){
        int n=nums.length;
        int sum=((n)*(n+1))/2;
        for(int i=0;i<n;i++)
            sum-=nums[i];
        return sum;
    }
}
