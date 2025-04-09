import java.util.*;

class ToggleBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input reading
        int n = sc.nextInt();
        sc.close();

       int mask=(1<<Integer.toBinaryString(n).length())-1;
       int result=mask^n;

       System.out.println(result);
    }
}
