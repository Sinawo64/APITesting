package Sets;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {
//Ordered hash set
        LinkedHashSet set = new LinkedHashSet<>();

        set.add("123");
        set.add("Snw");
        set.add("Bhut");
        set.add("5678");
        set.add("Mommy");

        System.out.println(set);
    }
}
