
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//this class is used to sort
class ListCompare implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        // TODO Auto-generated method stub
        return o2 - o1;
        //change this return as u want according to what u want o2 - o1 for des
        // if it -1 o1<o2 and 0 then they are equal, if o1>o2 +1
        // this thing is handled by sort on its own after getting the return values.
        
    }

}

public class ArrayListExample {
    public static void main(String[] args){
        //Arraylist is a parameterized class we can provide the type of which we are declaring.
        //We can also set an initial capacity if we know how many we are trying to store
        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> arrayList2 = new ArrayList<>(100);

        //To add items we can use fucntion list.add()
        list.add(1);
        list.add(3);
        list.add(0);
        list.add(2);

        //to get elements from list or arrayList we can use list.get(index)
        System.out.println("Elment at 2:" + list.get(2));

        //to get size we can use the function list.size()
        System.out.println(list.size());
        for(int i = 0; i < list.size();i++){
            System.out.println(list.get(i));
        }

        //for each loop for collections:
        for(int x : list){
            System.out.println(x);
        }

        //There is one method to check for existance of the element: list.contains(1) : bool
        System.out.println(list.contains(2));

        //to remove any elements we can use list.remove(index)
        System.out.println(list.remove(2));

        //we can also add elements at a paticular index buy using add(index,value)
        //A method set can replace an element at given index- set(index,value)
        //We can also do arrays.asList(); which returns list but not the parent interface (which is list)
        //We can again create a list using list.of(elements) but its an unmodified list

        //Sortong of ArrayList: Collections.sort(list)
        Collections.sort(list);
        System.out.println(list);
        //we can sort it without using collections as well - list.sort(null) where we are passing null as a comparetor
        list.sort(null);
        System.out.println(list);
        //but if we want to do more than natural sorting we have to implement the comparator interface.
        list.sort(new ListCompare());
        System.out.println(list);

        //that was the concept which we can do it with lambda exp aswell same as o2-o1 (a,b) -> 
    } 
}
