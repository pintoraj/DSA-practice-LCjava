/**
 * ArrayOccurance
 */
public class ArrayOccurance {

    public static int arrayOccur(int[] arr, int n, int num) {

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                count++;
            }

        }
        return count;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 2, 3 };

        System.out.println(arrayOccur(arr, arr.length, 2));
    }

}