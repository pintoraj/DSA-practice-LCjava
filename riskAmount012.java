
class riskAmount {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 1, 0, 2};
        int n=arr.length;

        // Dutch National Flag Algorithm
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                // Swap arr[low] and arr[mid] → Move 0 to the front
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                // 1 is correctly placed, just move forward
                mid++;
            } else {
                // Swap arr[mid] and arr[high] → Move 2 to the end
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--; // Reduce high pointer (no mid++ here)
            }
        }

        // Output result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
