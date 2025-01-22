import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;

public class duplicatePairs {
    public static void main(String[] args){
         List<Integer> numbers = new ArrayList<>(Arrays.asList(9, 5, 7, 3));
        System.out.println(canPair(numbers,6));
    }

    public static boolean canPair(List<Integer> arr, int k) {
        // code here.
        int n = arr.size();
        int count = 0;
        HashMap<Integer,Integer> visit = new HashMap<>();
        for(int i = 0; i< arr.size(); i++){
            for(int j = i+1; j<arr.size();j++){
                System.out.println(arr.get(i)+ ","+arr.get(j)+":"+(arr.get(i)+arr.get(j))%k);
                if((arr.get(i)+arr.get(j))%k == 0 && visit.getOrDefault(arr.get(i),0) != 1 && visit.getOrDefault(arr.get(j),0) != 1 ){
                    count++;
                    visit.put(arr.get(i),visit.getOrDefault(arr.get(i), 0)+1);
                    visit.put(arr.get(j),visit.getOrDefault(arr.get(j), 0)+1);

                }
                
            }
            
            
        }
        System.out.println(count);
        return 2*count == n;
    }
    
}


