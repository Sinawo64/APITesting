package ListInterface;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

       LinkedList list = new LinkedList();
//store numbers and object
        list.add(12);
        list.add(120);
        list.add(144);
        list.add("Java");
        list.add(159);
        list.add("Snw");

        System.out.println(list);
        list.addFirst("Sinawo");
        System.out.println(list);
        list.addLast("Sizwe");
        System.out.println(list);

    }

    }
