package Sets;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        //implements sorted Set

        TreeSet tSet = new TreeSet<>();

        tSet.add(12);
        tSet.add(01);
        tSet.add(99);
        tSet.add(40);
        tSet.add(5);

        System.out.println(tSet);

        tSet.remove(40);
        System.out.println(tSet);

        tSet.clear();
        System.out.println("Tree set is : " + tSet);






    }
}
