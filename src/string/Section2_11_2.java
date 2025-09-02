package string;

import java.util.LinkedHashMap;
import java.util.Map;

public class Section2_11_2 {
    public static void main(String[] args) {
        String str = "KKHSSSSSSSE";

        str = str + " ";
        int cnt = 1;

        String answer = "";

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                answer += str.charAt(i);
                answer += cnt;
                cnt = 1;
            }
        }
        System.out.println(answer);
    }
}
