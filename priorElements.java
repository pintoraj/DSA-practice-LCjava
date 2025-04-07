public class priorElements {
    public static void main(String[] args) {
        int[] arr={7,4,8,2,9};
        int n=arr.length;
        int maxVal=arr[0];
        int count=1;

        for(int i=1;i<n;i++){
            if(arr[i]>maxVal){
                count+=1;
                maxVal=arr[i];
            }
        }

        System.out.println(count);
    }
}
