public class RemoveInstance {

    int removeElement(int[] arr, int val){
        int n=arr.length;
     

        int j=0;
        for(int i=0; i < n-1;i++){
            if(arr[i]!=val){
                arr[j]=arr[i];
                j++;
            }
        }
        
        return j;
    }

    public static void main(String[] args) {
        RemoveInstance solution = new RemoveInstance();

        int[] nums = {3, 2, 2, 3}; // Input array
        int val = 3; // Value to remove
        int expectedLength = 2; // Expected length of array after removal

        int newLength = solution.removeElement(nums, val); // Calls your implementation

        // Print the array after removing elements
        System.out.print("Array after removing element " + val + ": ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        // Check if the result matches the expected length
        assert newLength == expectedLength : "Length mismatch";

        System.out.println("New Length: " + newLength);
    }
}
