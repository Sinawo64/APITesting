package ListInterface;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
// mostly store integers
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(12);
        list.add(14);
        list.add(17);
        list.add(21);
        list.add(77);

        System.out.println(list);
//print all list
        list.remove(1); //remove index one from the list

        System.out.println(list);
//just printed index 3 from the list
        System.out.println(list.get(3));
    }

}
