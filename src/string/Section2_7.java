package string;

public class Section2_7 {
    public static void main(String[] args) {

        String str = "gooG";

        str = str.toUpperCase();

        int lt = 0;
        int rt = str.length() - 1;
        while (lt < rt) {
            if (str.charAt(lt) != str.charAt(rt)) {
                System.out.println("NO");
                return;
            }
            lt++;
            rt--;
        }
        System.out.println("YES");
    }
}
