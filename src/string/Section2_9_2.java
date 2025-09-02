package string;

public class Section2_9_2 {
    public static void main(String[] args) {
        String str = "teachermode";
        String t = "e";

        int[] answer = new int[str.length()];
        int p = 1000; //거리

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t.charAt(0)) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }
        p = 1000;

        for (int i = str.length() -1; i >= 0; i--)  {
            if (str.charAt(i) == t.charAt(0)) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
    }
}
