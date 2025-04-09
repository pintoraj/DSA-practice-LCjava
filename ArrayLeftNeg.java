public class ArrayLeftNeg {
    public static void rearrangeElements(int[] arr, int n) {
        int j = 0;
        int temp;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {   // To get the negative numbers to the left
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }}
            
        for(int i=j;i<n;i++){    // To Sort
            for(int k=i+1;k<n;k++){
                if(arr[i]>arr[k]){
                    int temio=arr[i];
                arr[i]=arr[k];
                arr[k]=temio;
                }
            }}
    }

    public static void main(String[] args) {
        int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        rearrangeElements(arr, arr.length);
        for (int num : arr) {
            System.out.print(" " + num);
        }
    }
}
