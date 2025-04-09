public class ArrayMinMax {
    public static void arrayMinMax(int[] arr, int n) {

        int Minvalue = arr[0];
        int Maxvalue = arr[0];

        for (int i = 0; i < n; i++) {

            if (arr[i] < Minvalue) {
                Minvalue = arr[i];
            }
            if (arr[i] > Maxvalue) {
                Maxvalue = arr[i];
            }

        }
        System.out.println("Maxvalue: " + Maxvalue);
        System.out.println("Minvalue:  " + Minvalue);
    }

    public static void main(String[] args) {
        int[] arr = { 90, 42, 5, 3, -1, 23, -54, 78 };
        arrayMinMax(arr, arr.length);
    }

}
