public class NotRepeatingElement {
    
    static int NotRepeating(int[] arr, int n){
        for(int i=0;i<n;i++){
            int j=0;
            for( j=0;j<n;j++){
                if((i!=j )&& (arr[i]==arr[j])){
                    break;
                    
                }
            }
           
            if(j==n){
                return arr[i];
            }

        }

        return -1;
    }
    
    public static void main(String[] args){
        int[] arr={1,2,3,4,1,2,3};
        int element=NotRepeating(arr, arr.length);
        System.out.println(element);
    }

}
