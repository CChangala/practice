import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
public class AllpairsExamplerevisit {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,4,5,7};
        int[]  b = new int[]{ 5 ,6 ,3 ,4 ,8};
        Solution obj = new Solution();
        System.out.println(obj.allPairs(9,a,b));
    }
}
class pair{
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public pair[] allPairs(int target, int arr1[], int arr2[]) {
        // Your code goes here
        HashMap<Integer, Integer> a= new HashMap<>();
        List<pair> result = new ArrayList<>();
        for(int num:arr1){
            a.put(num,a.getOrDefault(num, 0));
        }
        for(int num:arr2){
            int a1 = target - num;
            if(a.containsKey(a1)){
                for (int i = 0; i <= a.get(a1); i++) {
                    result.add(new pair(a1, num));
                }
                
            }
        }
        //lambda function for sorting:
        result.sort((p1, p2) -> Long.compare(p1.first, p2.first));
        return result.toArray(new pair[0]);
    }
}
