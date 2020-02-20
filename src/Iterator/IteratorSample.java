package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorSample {
    public static void main(String[] args) {


        ArrayList al = new ArrayList();

        for(int i = 0; i < 3; i++){
            al.add(i);

            System.out.println("Elements of ArrayList : "+ al );

            Iterator itr = al.iterator();

            System.out.println("Starting Iterator");
            //checking the next element availability
            while(itr.hasNext()) {
                //moving cursor to the next element
                i = (Integer) itr.next();
                    //getting even elements one by one
                System.out.println(i + "");
                //Removing odd elements
                if (i % 2 != 0)
                    itr.remove();

            }
            System.out.println();
            System.out.println("Elements after remove operation: " + al);
        }
    }
}
