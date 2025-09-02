package string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Section2_11 {
    public static void main(String[] args) {
        String str = "KKHSSSSSSSE";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char ch: map.keySet()) {
            System.out.print(ch +"" + map.get(ch));
        }
    }
}
