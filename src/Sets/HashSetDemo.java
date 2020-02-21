package Sets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet hash = new HashSet<>();

        hash.add("Sinawo");
        hash.add("Hlaleleni");
        hash.add("Software");
        hash.add("Tester");
        hash.add("Mzantsi");

        System.out.println(hash);

//Remove hlaleleni from the list
        hash.remove("Hlaleleni");
        System.out.println(hash);

//listed to the next line
        Iterator i = hash.iterator();
        while(i.hasNext()){

            System.out.println(i.next());
        }
//Remove everything
        hash.clear();

        System.out.println("Hash is : " + hash);


    }
}
