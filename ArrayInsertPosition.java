
public class ArrayInsertPosition {
    public static int searchInsert(int[] arr) {
        int n = arr.length;
        int result = Integer.MIN_VALUE;
        int count = 0;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != arr[i + 1]) {
                count++;
                result=arr[i];
            }
            if (count == 3) {
                result = arr[i];
                break;
            }
        }
        return count >= 3 ?arr[n - 1]: result  ;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1};
       

        int ans = searchInsert(arr);
        System.out.println(ans);
    }
}
