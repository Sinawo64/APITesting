package ExceptionHandling;

public class FinallyBlock {
    public static void main(String[] args) {

        try {
            String text = "SinawoH";
            System.out.println(text);
        }finally{
            System.out.println("Hi, this is inside final block!");
        }

    }
}
