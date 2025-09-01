package string;

public class Section2_7_2 {
    public static void main(String[] args) {

        String str = "gooG";

        str = str.toUpperCase();

        String tmp = new StringBuilder(str).reverse().toString();

        if  (str.equals(tmp)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
