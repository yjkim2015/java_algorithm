package string;

public class Section2_9 {
    public static void main(String[] args) {
        String str = "teachermode";
        String t = "e";


        int lt = 0;

        while (lt < str.length()) {
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < str.length(); i++) {
                //if (i == lt) continue;
                if (str.charAt(i) == t.charAt(0)) {
                    min = Math.min(min, Math.abs(i - lt));
                }
            }
            lt++;
            System.out.print(min + " ");
        }
    }
}
