import java.util.HashMap;

public class MajorityElement {
    public static int majorityElement(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], i);
            }
        }

        for (int num : map.keySet()) {
            if (map.get(num) > (n / 2)) {
                return num;
            }
        }
        return arr[0];
    }

    public static void main(String[] args) {
        int[] arr = { 6,5,5 };
        System.out.println(majorityElement(arr));
    }
}
