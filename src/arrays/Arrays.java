package arrays;

public class Arrays {
    public static void main(String[] args) {
        // write your code here

        int arrayOne[] = new int[5];

        arrayOne[0] =12;
        arrayOne[1] =13;
        arrayOne[2] =14;
        arrayOne[3] =15;
        arrayOne[4] =16;

        System.out.println(arrayOne[2]);
        System.out.println("*************************************************");

        System.out.println("LOOP to display everything in an array");

        for(int i=0; i < arrayOne.length; i++){
            System.out.println(arrayOne[i]);
        }

    }
}
