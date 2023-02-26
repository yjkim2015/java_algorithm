import java.util.Scanner;

public class main2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray())
        {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            }
            else {
                result.append(Character.toUpperCase(ch));
            }
        }

        System.out.println(result);
    }
}
