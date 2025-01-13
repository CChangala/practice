
import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args){
        //Arraylist is a parameterized class we can provide the type of which we are declaring.
        //We can also set an initial capacity if we know how many we are trying to store
        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> arrayList2 = new ArrayList<>(100);

        //To add items we can use fucntion list.add()
        list.add(1);
        list.add(2);
        list.add(3);

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

    } 
}
