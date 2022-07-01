public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letter = {'c','f','j'};
        System.out.println(nextGreatestLetter(letter,'c'));
    }
    public static char nextGreatestLetter(char[] letters, char target){
 /*       int s=0;
        int e = letters.length-1;

        while (s<e){
            int m = s+ (e-s)/2;

            if (target <= m ){
                e = m;
            }else s = m+1;

        } return letters[0]; */




        //Leetcode's ans

        int s = 0;
        int e = letters.length -1;

        while(s<= e){
            int mid = s + (e-s)/2;


            if ( target < letters[mid]){
                e = mid -1;
            } else s= mid +1;

        } return letters[s % letters.length];
    }
}
