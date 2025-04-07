import java.util.ArrayList;
import java.util.TreeSet;

public class findCommon {

    static ArrayList<Integer> findCommoIntegers(int[] arr1, int[] arr2, int[] arr3) {
        TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();
        TreeSet<Integer> set3 = new TreeSet<>();
    
        for(int i:arr1){
            set1.add(i);
        }
        for(int i:arr2){
            set2.add(i);
        }
        for(int i:arr3){
            set3.add(i);
        }
        

        ArrayList<Integer> result = new ArrayList<>();

        for (int j : set1) {
            if(set1.contains(j)&&set2.contains(j)){
                result.add(j);
            }

        }
        return result;

    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 5, 10, 20, 40, 80,100 };
        int[] arr2 = { 6, 7, 20, 80, 100 };
        int[] arr3 = { 3, 4, 15, 20, 30, 70, 80,100, 120 };

        ArrayList<Integer> result = findCommoIntegers(arr1, arr2, arr3);
        for (int i : result) {
            System.out.print(" " + i);
        }

    }

}
