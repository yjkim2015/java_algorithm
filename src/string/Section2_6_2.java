package string;

import java.util.HashSet;
import java.util.Set;

public class Section2_6_2 {
    public static void main(String[] args) {
        String str = "ksekkset";
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            if (i == str.indexOf(str.charAt(i))) {
                answer += str.charAt(i);
               }
        }
        System.out.println(answer);
    }
}
