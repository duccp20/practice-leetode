public class _1295 {

    public static int findNumbers(int[] nums) {
        // bước 1: Duyệt qua arr
        int count = 0;
        for (int val : nums) {

            int res = calcNumOfDigit(val);
            if (res % 2 ==0)
                count++;

        }
        // bước 2: Calc number of digit in each num. If result is event => increase 1 in count variable
        return count;
    }

    public static int calcNumOfDigit(int val) {
        int count = 0;
        int res = val;
        while (res != 0) {
            res = val / 10;
            val = res;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] num = {1,22,3};
        System.out.println(calcNumOfDigit(333));

    }
}
