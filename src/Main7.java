import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String result = "YES";

        int right = input.length()-1;

        for (int i = 0; i < input.length() / 2; i++) {
            if (Character.toLowerCase(input.charAt(i)) != Character.toLowerCase(input.charAt(right-i))) {
                result = "NO";
            }
        }

        /*
            StringBuild Reverse
            String s = new StringBuilder(input).reverse().toString();
         */

        System.out.println(result);
     }
}
