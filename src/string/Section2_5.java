package string;

import java.util.HashMap;
import java.util.Map;

public class Section2_5 {
    public static void main(String[] args) {

        String str = "a#b!GE*T@S";

        Map<Integer, Character> map = new HashMap<>();
        StringBuilder letters = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isLetter(c)) {
                map.put(i, c);
            }
            else {
                letters.append(c);
            }
        }

        letters = letters.reverse();

        for (Map.Entry<Integer, Character> entry : map.entrySet()) {
            Character value = entry.getValue();
            Integer key = entry.getKey();
            letters.insert(key.intValue(), value);
        }

        System.out.println(letters.toString());
    }
}
