package string;

public class StringMethodP3 {
    public static void main(String[] args) {
        System.out.println("*****Replace string*****");
      String text = "Hello team";
      String snw = "My name is unkown!";

      String text1 = text.replace("o", "a");
      String snw1 = snw.replace("is", "was");
        System.out.println(text1);
        System.out.println(snw1);
       //

        System.out.println("*****Split string*****");
     String [] snwah = snw.split(" ");

        for (int i = 0; i<snwah.length;i++)
        {
            System.out.println(snwah[i]);
        }

        System.out.println("*****StartingWith string*****");
        System.out.println(snw.startsWith("My"));

    }
}
