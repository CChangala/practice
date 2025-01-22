import java.util.HashMap;

public class hashingexample2 {
    public static int firstElementKTime(int[] arr, int k) {
        // write code
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num:arr){
            freq.put(num,freq.getOrDefault(num, 0)+1);
            if (freq.get(num) == k) {
                return num;
            }
        }
        for(int key:freq.keySet()){
            if(freq.get(key)>=k){
                return key;
            }
        }
        return 0;
        
    }
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(firstElementKTime(arr,2));
    }
}
