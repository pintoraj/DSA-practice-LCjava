public class LeetCode747 {
    
    public static int dominantIndex(int[] arr) {
        int n=arr.length;
        int maxSum=arr[0];
        int maxSumIndex=0;

        for(int i=1;i<n;i++){
            if(arr[i]>maxSum){
                maxSum=arr[i];
                maxSumIndex=i;
            }
        }

        for(int i=0;i<n;i++){
            if(i!=maxSumIndex && arr[i]*2>maxSum){
                return -1;
            }
        }

        return maxSumIndex;
    }      
    public static void main(String[] args) {
            int[] arr={3,6,1,0};
            int ans=dominantIndex(arr);
            System.out.println(ans);
        }
    
}
