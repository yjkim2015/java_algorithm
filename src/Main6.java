import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String result = "";

        for(char ch : input.toCharArray()) {
            String s = String.valueOf(ch);
            if (!result.contains(s)) {
                result += s;
            }
        }

        System.out.println(result);

    }
}
