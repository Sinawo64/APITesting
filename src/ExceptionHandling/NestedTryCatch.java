package ExceptionHandling;

public class NestedTryCatch {

    public static void main(String[] args) {
        try{
            System.out.println("First try Block");

            String text = "SinawoH";
            System.out.println(text.length());

            try{
                System.out.println("Second try Block");
                int value = 100/0;

                try{
                    System.out.println("Third try block");

                    int[] array = new int [3];
                    array[5] = 100;

                }catch(Exception e){
                    System.out.println("End of Third try Block");
                    e.printStackTrace();
                }

            }catch(Exception e){

                System.out.println("End of second try Block");
                e.printStackTrace();
            }

        }catch(Exception e){

            System.out.println("End of First try Block");
            e.printStackTrace();
        }


    }
}
