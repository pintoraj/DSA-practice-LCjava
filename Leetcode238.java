import java.util.Arrays;

public class Leetcode238 {
    public static int[] productExceptSelf(int[] arr) {
        int n=arr.length;
        int[] temp=new int[n];
        
        int leftProduct=1;
        for(int i=0;i<n;i++){
            temp[i]=leftProduct;
            leftProduct*=arr[i];
        }

        int rightProduct = 1;
        for (int i = n-1 ; i >=0; i--) {
            temp[i] *= rightProduct;
            rightProduct *= arr[i];
        }
        
        return temp;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] result=productExceptSelf(arr);
        System.out.println(Arrays.toString(result));
        
    }
}