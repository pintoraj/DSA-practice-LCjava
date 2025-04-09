public class productDigits {
    public static void main(String[] args) {
        int n = 5244;
        System.out.println(findProduct(n));
    }

    

    static int findProduct(int n){
        if(n==0) return 1; // base case 

        return (n%10) * findProduct(n/10); // get the last digit * and also reduce the number by / 10;
    }
}
