public class SqrtX {
    public static void main(String[] args) {
        System.out.println(sqrt(9));
    }

    public static int sqrt(int x) {
        int start = 2;
        int end = x;
        int middle = 0;

        if (x <= 1) {
            return x;
        }

        while (start <= end) {
            middle = (start + (end - start) / 2);

            int y = x / middle;

            if (middle == y) {
                return middle;
            } else if (middle > y) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }

            if (start > x / start) {
                return start - 1;
            }


        }
        return start;
    }
}
