import java.util.HashMap;

public class DistributeCandies {
        public static int distributeCandies(int[] arr) {
            int n=arr.length;
            HashMap<Integer, Integer> map=new HashMap<>();
            for(int num:arr){
                if(map.containsKey(num)){
                    map.put(num,map.get(num)+1);
                }
                else{
                    map.put(num,1);
                }
            }
            int count=0;
    
            for(int nums:map.keySet()){
                count++;
            }
    
            if(count==1){
                return 1;
            }
    
            return n/2;
        }

        public static void main(String[] args) {
            int[] arr={1,1,1,1,2,2,2,3,3,3};
            int ans=distributeCandies(arr);
            System.out.println(ans);
        }
    
}
