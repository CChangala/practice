import java.util.HashMap;
import java.util.Arrays;

public class HashMapExm {
    public static void main(String[] args) {
        // Write Your Code Here
        int[] v = new int[]{12, 17, 16 };
        Arrays.sort(v);
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num:v){
            System.out.println(num);
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        System.out.println(freq);
        int maxKey = 0;
        int minKey = 0;
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        for(int key:freq.keySet()){
            
            if(freq.get(key)> maxValue){
                maxValue = freq.get(key);
                maxKey = key;
            }

            if(freq.get(key)< minValue){
                minValue = freq.get(key);
                minKey = key;
            }
        }

        int[] out = new int[2];
        out[0] = minKey;
        out[1] = maxKey;

    }
}