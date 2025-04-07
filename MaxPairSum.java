import java.util.Arrays;

public class MaxPairSum {

    public static int[] maxSum(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            int a = arr[i];
            int sum = 0;
            while (a > 0) {
                int r = a % 10;
                sum = (sum * 10) + r;
                a /= 10;
            }

            for (int j = i + 1; j < n; j++) {
                int b = arr[j];
                if (sum == b) {
                    temp[i] = arr[i];
                    temp[j] = b;
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = { 51, 71, 17, 24, 42 };
        int[] temp = maxSum(arr);
        System.out.println(Arrays.toString(temp));
    }

}
