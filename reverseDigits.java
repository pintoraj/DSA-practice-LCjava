public class reverseDigits {
    public static void main(String[] args) {
        int n=54224;
        System.out.println(reverseDigits(n,0));
    }

    static int reverseDigits(int n, int reversed){
        if(n==0) return reversed;

        return reverseDigits(n/10, reversed*10+n%10);
    }
}
