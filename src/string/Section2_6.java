package string;

import java.util.HashSet;
import java.util.Set;

public class Section2_6 {
    public static void main(String[] args) {
        String str = "ksekkset";

        Set<Character> set = new HashSet<>();

        for(int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

    }
}
