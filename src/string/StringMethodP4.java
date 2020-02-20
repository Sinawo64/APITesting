package string;

public class StringMethodP4 {
    public static void main(String[] args) {
       /* System.out.println("*****substring String*****");*/

        String text = "South Africa";

       /* System.out.println(text.substring(3));
        System.out.println("****Start with the 3rd and End with the 8th one!");
        System.out.println(text.substring(3,8));
*/
       /* System.out.println("*****toCharArray String*****");

        char [] charArray = text.toCharArray();
        System.out.println("Main String is : " + text);
            for (int i = 0; i < charArray.length; i++){
                System.out.println(charArray[i]);
            }*/

        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());

        System.out.println("*****Trim String*****");
        String text1 = "My work is          ";
        String text2 = "            Great";

        System.out.println(text1+text2);
        System.out.println(text1.trim() + text2);
        System.out.println(text1.trim() + text2.trim());
    }
}
