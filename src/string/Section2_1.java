package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Section2_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char c = sc.next().charAt(0);
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        int result = 0;
        for (char ch : str.toCharArray()) {
            if (ch == c) {
                result++;
            }
        }

        System.out.println(result);
    }
}
