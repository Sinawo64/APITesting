package ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {


        List n = new ArrayList();

        n.add(0, 10);
        n.add(1, 15);

        System.out.println(n);


        List s = new ArrayList();
        s.add(10);
        s.add(15);
        s.add(15);
        s.add(10);
        s.add(188);

        n.addAll(1,s);

        System.out.println(n);
        /*n.remove(3);
        System.out.println("Index present at 5th Index : " + n.get(5));
        //replace index 5 with that number
        n.set(5, 122);
        System.out.println("After set operation: " + n);*/
        System.out.println(n.indexOf(10));

    }

}
