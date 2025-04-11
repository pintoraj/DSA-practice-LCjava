/**
 * ArrayRotate
 */
public class ArrayRotate {

   public static void rotateArray(int[] arr, int n){
    System.out.print("Old Array:");

    for(int k:arr){
        System.out.print(" "+k);
    }System.out.println();
    if(n==1){
        System.out.println("Only one element found"+arr[0]);
    }

    int La_element=arr[n-1];
    for(int i=n-1;i>0;i--){
        arr[i]=arr[i-1];

    }
    arr[0]=La_element;
    System.out.print("Rotated Array:");
    for(int j:arr){
        System.out.print(" "+j);
    }

}


public static void main(String[] args) {
    int[] arr={2,3,4,5,1};
    rotateArray(arr, arr.length);
}

}